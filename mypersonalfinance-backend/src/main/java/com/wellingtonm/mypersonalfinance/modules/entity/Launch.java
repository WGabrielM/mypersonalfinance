package com.wellingtonm.mypersonalfinance.modules.entity;

import com.wellingtonm.mypersonalfinance.enums.LauchStatus;
import com.wellingtonm.mypersonalfinance.enums.LaunchType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.convert.Jsr310Converters;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "launch", schema = "finance")
public class Launch {

    @Id
    @Column(name = "id")
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "registration_date")
    @Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
    private LocalDate registrationDate;

    @Column(name = "month")
    private Integer month;

    @Column(name = "year")
    private Integer year;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @Column(name = "value")
    private BigDecimal value;

    @Column(name = "type")
    @Enumerated(value = EnumType.STRING)
    private LaunchType type;

    @Column(name = "status")
    @Enumerated(value = EnumType.STRING)
    private LauchStatus status;
}
