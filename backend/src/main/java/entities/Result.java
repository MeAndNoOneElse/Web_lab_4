package entities;

import lombok.*;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "check_results")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Result {
    @Id
    @GeneratedValue
    @Column(columnDefinition = "UUID")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(precision = 10, scale = 5)
    private BigDecimal x;

    @Column(precision = 10, scale = 5)
    private BigDecimal y;

    @Column(precision = 10, scale = 5)
    private BigDecimal radius;

    private Boolean inRegion;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;
}
