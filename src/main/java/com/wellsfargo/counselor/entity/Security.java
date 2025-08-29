package entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Double purchasePrice;

    @Column(nullable = false)
    private LocalDate purchaseDate;

    @Column(nullable = false)
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "portfolioId", nullable = false)
    private Portfolio portfolio;

    public Security(String category, Double purchasePrice, LocalDate purchaseDate, Integer quantity, Portfolio portfolio) {
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
        this.portfolio = portfolio;
    }

    public Security() {}

    public Long getSecurityId() { return securityId; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public Double getPurchasePrice() { return purchasePrice; }
    public void setPurchasePrice(Double purchasePrice) { this.purchasePrice = purchasePrice; }

    public LocalDate getPurchaseDate() { return purchaseDate; }
    public void setPurchaseDate(LocalDate purchaseDate) { this.purchaseDate = purchaseDate; }

    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }

    public Portfolio getPortfolio() { return portfolio; }
    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }
}
