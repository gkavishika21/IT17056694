package com.sliit.paf.product.dto;

public class PrdouctDTO extends SuperDTO {

    private String CodeNo ;
    private String ProductName;
    private double unitPrice;
    private int qtyOnHand;
    private String RAM;
    private String Memory;
    private  String description;

    public PrdouctDTO() {
    }

    public PrdouctDTO(String codeNo, String productName, double unitPrice, int qtyOnHand, String RAM, String memory, String description) {
        CodeNo = codeNo;
        ProductName = productName;
        this.unitPrice = unitPrice;
        this.qtyOnHand = qtyOnHand;
        this.RAM = RAM;
        Memory = memory;
        this.description = description;
    }

    public String getCodeNo() {
        return CodeNo;
    }

    public void setCodeNo(String codeNo) {
        CodeNo = codeNo;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getMemory() {
        return Memory;
    }

    public void setMemory(String memory) {
        Memory = memory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "PrdouctDTO{" +
                "CodeNo='" + CodeNo + '\'' +
                ", ProductName='" + ProductName + '\'' +
                ", unitPrice=" + unitPrice +
                ", qtyOnHand=" + qtyOnHand +
                ", RAM='" + RAM + '\'' +
                ", Memory='" + Memory + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
