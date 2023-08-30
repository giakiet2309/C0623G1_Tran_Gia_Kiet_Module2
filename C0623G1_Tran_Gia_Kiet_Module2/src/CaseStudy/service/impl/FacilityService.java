package CaseStudy.service.impl;

import CaseStudy.model.furama.Facility;
import CaseStudy.repository.impl.FacilityRepository;
import CaseStudy.service.IFacilityService;
import CaseStudy.utils.Regex;
import CaseStudy.utils.Validator;

import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    Scanner scanner = new Scanner(System.in);
    private static FacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public void maintenanceList() {

    }

    @Override
    public void add() {


    }

    @Override
    public void delete() {

    }


    @Override
    public void display() {

    }
}
