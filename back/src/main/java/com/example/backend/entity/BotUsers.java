package com.example.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "clients")
public class BotUsers {

    @Id
    @Column(name = "telegramid", unique = true)
    private BigInteger telegramid;

    @Column(name = "Status", length = 9, nullable = false)
    private String status;

    @Column(name = "Bitget", length = 500)
    private String bitget;

    @Column(name = "Kucoin", length = 500)
    private String kucoin;

    @Column(name = "Bingx", length = 500)
    private String bingx;

    @Column(name = "Bybit", length = 500)
    private String bybit;

    @Column(name = "Leverage", nullable = false)
    private BigInteger leverage;

    @Column(name = "Amount", nullable = false)
    private BigInteger amount;

    @Column(name = "Margin", nullable = false)
    private BigInteger margin;

    @Column(name = "Tpslstatus", nullable = false)
    private BigInteger tpslstatus;

    @Column(name = "Tpstatus", nullable = false)
    private BigInteger tpstatus;

    @Column(name = "Takeprofit1", nullable = false)
    private BigInteger takeprofit1;

    @Column(name = "Takeprofit2", nullable = false)
    private BigInteger takeprofit2;

    @Column(name = "Tp1amount", nullable = false)
    private BigInteger tp1amount;

    @Column(name = "Tp2amount", nullable = false)
    private BigInteger tp2amount;

    @Column(name = "Stoploss", nullable = false)
    private BigInteger stoploss;

    @Column(name = "Password", length = 500)
    private String password;
}
