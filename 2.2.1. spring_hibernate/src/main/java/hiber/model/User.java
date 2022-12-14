package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(name = "name")
   private String firstName;

   @Column(name = "last_name")
   private String lastName;

   @Column(name = "email")
   private String email;

   @OneToOne(cascade = CascadeType.ALL)
   private Cars cars;

   public User() {
   }

   public User(String firstName, String lastName, String email, Cars cars) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
      this.cars = cars;
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }
   public Cars getCars(){
      return cars;
   }
   public void setCars(){
      this.cars = cars;
   }

   @Override
   public String toString() {
      return "firstName: " + firstName + ", " +
              "lastName: " + lastName + ", " +
              "email: " + email + ", " +
              cars.toString();
   }
}