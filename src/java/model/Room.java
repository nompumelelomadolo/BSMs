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
 * Room generated by hbm2java
 */
@Entity
@Table(name="room"
    ,catalog="bsm"
)
public class Room  implements java.io.Serializable {


     private int roomId;
     private House house;
     private String roomType;
     private double roomPrice;
     private String roomStatus;
     private char genderType;
     private Set payments = new HashSet(0);
     private Set contracts = new HashSet(0);
     private Set contracts_1 = new HashSet(0);

    public Room() {
    }

	
    public Room(int roomId, House house, String roomType, double roomPrice, String roomStatus, char genderType) {
        this.roomId = roomId;
        this.house = house;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.roomStatus = roomStatus;
        this.genderType = genderType;
    }
    public Room(int roomId, House house, String roomType, double roomPrice, String roomStatus, char genderType, Set payments, Set contracts, Set contracts_1) {
       this.roomId = roomId;
       this.house = house;
       this.roomType = roomType;
       this.roomPrice = roomPrice;
       this.roomStatus = roomStatus;
       this.genderType = genderType;
       this.payments = payments;
       this.contracts = contracts;
       this.contracts_1 = contracts_1;
    }
   
     @Id 

    
    @Column(name="RoomId", unique=true, nullable=false)
    public int getRoomId() {
        return this.roomId;
    }
    
    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="HouseId", nullable=false)
    public House getHouse() {
        return this.house;
    }
    
    public void setHouse(House house) {
        this.house = house;
    }

    
    @Column(name="RoomType", nullable=false, length=20)
    public String getRoomType() {
        return this.roomType;
    }
    
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    
    @Column(name="RoomPrice", nullable=false, precision=12)
    public double getRoomPrice() {
        return this.roomPrice;
    }
    
    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    
    @Column(name="RoomStatus", nullable=false, length=20)
    public String getRoomStatus() {
        return this.roomStatus;
    }
    
    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
    }

    
    @Column(name="GenderType", nullable=false, length=1)
    public char getGenderType() {
        return this.genderType;
    }
    
    public void setGenderType(char genderType) {
        this.genderType = genderType;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="room")
    public Set getPayments() {
        return this.payments;
    }
    
    public void setPayments(Set payments) {
        this.payments = payments;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="room")
    public Set getContracts() {
        return this.contracts;
    }
    
    public void setContracts(Set contracts) {
        this.contracts = contracts;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="room")
    public Set getContracts_1() {
        return this.contracts_1;
    }
    
    public void setContracts_1(Set contracts_1) {
        this.contracts_1 = contracts_1;
    }




}

