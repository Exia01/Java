package com.codingdojo.statelicense.models;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
// import javax.persistence.CascadeType;
// import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
//import javax.persistence.Transient;
// import javax.validation.constraints.Size;
@Entity
public class License {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String number;

	private LocalDate expiration; //will use this set the expiration date. 

	private String state; //Issuing state. 

	private Date created_at; //self explanatory
	private Date updated_at;  //self explanatory
	
    @OneToOne(fetch=FetchType.LAZY) // need to look this up and figure out what it is again. 
    @JoinColumn(name="person_id")
    private Person person;
//   @Transient// transient is a variables modifier used in serialization. At the time of serialization, if we don’t want to save value of a particular variable in a file,
   private static int count;

        public License() { // when we create a license, we are giving it the following attributes. 
           License.count += 1; //increase the count every time 
            this.number = String.format("%06d", License.count); // this is to add 6 zeros at the end of it. 
			this.expiration = LocalDate.now().plusDays(1095); //add 3 years to the expiration date. 
//			System.out.println(this.number);
        }
        
        public License(String state, Person person) {
            this.state = state;
            this.person = person;
        }
        


    // getters and setters 
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public LocalDate getExpiration() {
		return expiration;
	}

	public void setExpiration(LocalDate expiration) {
		this.expiration = expiration;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

//	public static int getCount() {
//		return count;
//	}
//
//	public static void setCount(int count) {
//		License.count = count;
//    }
    

    public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
    
    
	@PrePersist
    protected void onCreate(){
		this.setCreated_at(new Date());
		this.setUpdated_at(new Date());
    }

    @PreUpdate
    protected void onUpdate(){
    	this.setUpdated_at(new Date()); 
    }

}
