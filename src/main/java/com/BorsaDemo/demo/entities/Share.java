package com.BorsaDemo.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "share")
public class Share {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "share_id")
    private int shareId;

    @NotBlank
    @NotEmpty
    @Column(name = "code")
    private String code;

    @NotBlank
    @NotEmpty
    @Column(name = "share_name")
    private String shareName;

    @Transient
    @Column(name = "share_price")
    private int sharePrice;

    @CreationTimestamp
    @Transient
    @Temporal(TemporalType.TIMESTAMP)
    private Date publishAt;


}
