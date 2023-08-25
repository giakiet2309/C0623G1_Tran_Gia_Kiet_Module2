package CaseStudy.model;

public class Contract {
    private String idContract;
    private String idBooking;
    private double deposit;
    private double total;

    public Contract() {
    }

    public Contract(String idContract, String idBooking, double deposit, double total) {
        this.idContract = idContract;
        this.idBooking = idBooking;
        this.deposit = deposit;
        this.total = total;
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idContract='" + idContract + '\'' +
                ", idBooking='" + idBooking + '\'' +
                ", deposit=" + deposit +
                ", total=" + total +
                '}';
    }
}
