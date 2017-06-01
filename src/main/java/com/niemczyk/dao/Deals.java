package com.niemczyk.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Created by Bartek on 31.05.2017.
 */
@Entity
@Table(name = "UMOWA_BS")
public class Deals {
    @Id
    @Column(name = "SYSTEM_NAZWA")
    private String productName;
    @Column(name = "ZAPOTRZEBOWANIE")
    private int orderRequest;
    @Column(name = "NUMER_ZAMOWIENIA")
    private String orderNumber;
    @Column(name = "DATA_OD")
    private String dateFrom;
    @Column(name = "DATA_DO")
    private String dateTo;
    @Column(name = "WPLYWY")
    private BigDecimal amount;
    @Column(name = "WPLYWY_RODZAJ")
    private String amountType;
    @Column(name = "SKALA")
    private String period;
    @Column(name = "PROCENT")
    private int percent;
    @Column(name = "AKTYWNOSC")
    private String activ;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getOrderRequest() {
        return orderRequest;
    }

    public void setOrderRequest(int orderRequest) {
        this.orderRequest = orderRequest;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getAmountType() {
        return amountType;
    }

    public void setAmountType(String amountType) {
        this.amountType = amountType;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public String getActiv() {
        return activ;
    }

    public void setActiv(String activ) {
        this.activ = activ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Deals deals = (Deals) o;

        if (orderRequest != deals.orderRequest) return false;
        if (percent != deals.percent) return false;
        if (productName != null ? !productName.equals(deals.productName) : deals.productName != null) return false;
        if (orderNumber != null ? !orderNumber.equals(deals.orderNumber) : deals.orderNumber != null) return false;
        if (dateFrom != null ? !dateFrom.equals(deals.dateFrom) : deals.dateFrom != null) return false;
        if (dateTo != null ? !dateTo.equals(deals.dateTo) : deals.dateTo != null) return false;
        if (amount != null ? !amount.equals(deals.amount) : deals.amount != null) return false;
        if (amountType != null ? !amountType.equals(deals.amountType) : deals.amountType != null) return false;
        if (period != null ? !period.equals(deals.period) : deals.period != null) return false;
        return activ != null ? activ.equals(deals.activ) : deals.activ == null;
    }

    @Override
    public int hashCode() {
        int result = productName != null ? productName.hashCode() : 0;
        result = 31 * result + orderRequest;
        result = 31 * result + (orderNumber != null ? orderNumber.hashCode() : 0);
        result = 31 * result + (dateFrom != null ? dateFrom.hashCode() : 0);
        result = 31 * result + (dateTo != null ? dateTo.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (amountType != null ? amountType.hashCode() : 0);
        result = 31 * result + (period != null ? period.hashCode() : 0);
        result = 31 * result + percent;
        result = 31 * result + (activ != null ? activ.hashCode() : 0);
        return result;
    }
}
