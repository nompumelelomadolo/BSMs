package model;
// Generated Jun 7, 2016 11:29:30 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Employee generated by hbm2java
 */
@Entity
@Table(name="employee"
    ,catalog="bsm"
)
public class Employee  implements java.io.Serializable {


     private int empId;
     private Address address;
     private String empName;
     private String empSurname;
     private int contact;
     private String empType;
     private String userName;
     private String password;
     private String email;
     private Set payments = new HashSet(0);
     private Set houses = new HashSet(0);
     private Set tenants = new HashSet(0);

    public Employee() {
    }

	
    public Employee(int empId, String empName, String empSurname, int contact, String empType, String userName, String password, String email) {
        this.empId = empId;
        this.empName = empName;
        this.empSurname = empSurname;
        this.contact = contact;
        this.empType = empType;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }
    public Employee(int empId, Address address, String empName, String empSurname, int contact, String empType, String userName, String password, String email, Set payments, Set houses, Set tenants) {
       this.empId = empId;
       this.address = address;
       this.empName = empName;
       this.empSurname = empSurname;
       this.contact = contact;
       this.empType = empType;
       this.userName = userName;
       this.password = password;
       this.email = email;
       this.payments = payments;
       this.houses = houses;
       this.tenants = tenants;
    }
   
     @Id 

    
    @Column(name="EmpId", unique=true, nullable=false)
    public int getEmpId() {
        return this.empId;
    }
    
    public void setEmpId(int empId) {
        this.empId = empId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="AddressId")
    public Address getAddress() {
        return this.address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }

    
    @Column(name="EmpName", nullable=false, length=25)
    public String getEmpName() {
        return this.empName;
    }
    
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    
    @Column(name="EmpSurname", nullable=false, length=25)
    public String getEmpSurname() {
        return this.empSurname;
    }
    
    public void setEmpSurname(String empSurname) {
        this.empSurname = empSurname;
    }

    
    @Column(name="Contact", nullable=false)
    public int getContact() {
        return this.contact;
    }
    
    public void setContact(int contact) {
        this.contact = contact;
    }

    
    @Column(name="EmpType", nullable=false, length=50)
    public String getEmpType() {
        return this.empType;
    }
    
    public void setEmpType(String empType) {
        this.empType = empType;
    }

    
    @Column(name="UserName", nullable=false, length=15)
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    
    @Column(name="Password", nullable=false, length=15)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="Email", nullable=false, length=50)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="employee")
    public Set getPayments() {
        return this.payments;
    }
    
    public void setPayments(Set payments) {
        this.payments = payments;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="employee")
    public Set getHouses() {
        return this.houses;
    }
    
    public void setHouses(Set houses) {
        this.houses = houses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="employee")
    public Set getTenants() {
        return this.tenants;
    }
    
    public void setTenants(Set tenants) {
        this.tenants = tenants;
    }
}

