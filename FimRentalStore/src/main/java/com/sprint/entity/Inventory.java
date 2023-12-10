package com.sprint.entity;

import java.sql.Timestamp;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "inventory")
public class Inventory{
	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventory_id")
    private int inventoryId;
    
	
    @JoinColumn(name = "film_id")
    private Film film;
 
    @JoinColumn(name = "store_id")
    private Store store;

    @Column(name = "last_update")
    private Timestamp lastUpdate;

	public Inventory() {
		super();
	}

	public Inventory(int inventoryId, Film film, Store store, Timestamp lastUpdate) {
		super();
		this.inventoryId = inventoryId;
		this.film = film;
		this.store = store;
		this.lastUpdate = lastUpdate;
	}

	public int getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public Timestamp getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	} 
}
 
    
 
	