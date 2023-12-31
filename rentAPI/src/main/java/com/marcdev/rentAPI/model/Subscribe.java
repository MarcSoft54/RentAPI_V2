package com.marcdev.rentAPI.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "subscribe", schema = "rent")
public class Subscribe {
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    User user;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "subscribe_at")
    private Timestamp subscribeAt;

    @Column
    private Long subscriber;
}
