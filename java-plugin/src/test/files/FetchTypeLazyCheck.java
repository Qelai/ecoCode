package fr.greencodeinitiative.java.checks;

import java.util.regex.Pattern;
@Entity
@Table (name = "ECO_CODE")
class FetchTypeLazyCheck {
    FetchTypeLazyCheck(FetchTypeLazyCheck mc) {
    }

    @Id
    @GeneratedValue
    @Column(name="ORDER_ID")
    private Long orderId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="USER_ID")
    private UserLazy user;
   
}