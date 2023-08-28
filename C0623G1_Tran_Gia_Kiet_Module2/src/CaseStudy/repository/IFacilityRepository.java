package CaseStudy.repository;

import CaseStudy.model.furama.Facility;

public interface IFacilityRepository extends IFurameRepo<Facility> {
    void maintenanceList();
}
