package week12.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class LandService {

    private List<Land> lands = new ArrayList<>();
    private List<OwnerTax> ownerTaxes = new ArrayList<>();

    public List<Land> getLands() {
        return new ArrayList<>(lands);
    }

    public List<OwnerTax> getOwnerTaxes() {
        return new ArrayList<>(ownerTaxes);
    }

    public void readFile(Path path) {
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                processLine(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
    }

    private void processLine(String line) {
        String[] parts = line.split(" ");
        String ownerTaxNumber = parts[0];
        String street = parts[1];
        String houseNumber = parts[2];
        TaxBand taxBand = TaxBand.valueOf(parts[3]);
        int area = Integer.parseInt(parts[4]);

        Land newLand = new Land(ownerTaxNumber, street, houseNumber, taxBand, area);
        lands.add(newLand);

        int alreadyExist = checkOwnerAlreadyExist(ownerTaxNumber);
        if (alreadyExist == -1) {
            ownerTaxes.add(new OwnerTax(ownerTaxNumber, newLand.getTax()));
        } else {
            ownerTaxes.get(alreadyExist).increaseTax(newLand.getTax());
        }
    }

    private int checkOwnerAlreadyExist(String taxNumber) {
        for (int i = 0; i < ownerTaxes.size(); i++) {
            if (ownerTaxes.get(i).getTaxNumber().equals(taxNumber)) {
                return i;
            }
        }
        return -1;
    }

    public List<String> getStreetToCorrect() {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < lands.size() - 1; i++) {
            String street = lands.get(i).getStreet();
            TaxBand taxBand = lands.get(i).getTaxBand();
            String streetNext = lands.get(i + 1).getStreet();
            TaxBand taxBandNext = lands.get(i + 1).getTaxBand();
            if (street.equals(streetNext) && !taxBand.equals(taxBandNext) && !result.contains(street)) {
                result.add(street);
            }
        }
        return result;
    }

    public void writeTaxList(Path path) {
        List<String> dataToWrite = makeTaxList();
        try {
            Files.write(path, dataToWrite);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private List<String> makeTaxList() {
        List<String> result = new ArrayList<>();
        for (OwnerTax o : ownerTaxes) {
            result.add(o.getTaxNumber() + " " + o.getFullTax());
        }
        return result;
    }


}
