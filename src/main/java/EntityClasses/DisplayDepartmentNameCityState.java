package EntityClasses;

import javax.persistence.*;

@Entity
@Table(name="locations")
@SecondaryTable(name="departments", pkJoinColumns = @PrimaryKeyJoinColumn(name="location_id"))
public class DisplayDepartmentNameCityState {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Location")
    Long location;

    @Column(name = "city", table = "locations")
    String city;

    @Column(name = "stateProvince", table = "locations")
    String state;

    @Column(name="department_name", table = "departments")
    String name;
}
