package models;

import java.util.List;

@Entity(name = "flights")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column(name = "destination")
    private String destination;


    @Column(name = "capacity")
    private int capacity;


    @Column(name = "departureDate")
    private String departureDate;


    @Column(name = "departureTime")
    private String departureTime;




    @ManyToMany
    @JoinTable(
            name = "flights_passengers",
            joinColumns = {@JoinColumn(name = "flight_id", nullable = false)},
            inverseJoinColumns = {@JoinColumn(name = "passenger_id", nullable = false)}
    )
    @JsonIgnoreProperties({"flights"})
    private List<Passenger> passengers;

}
