package model;

import java.util.LinkedList;

public class Entrenador {

	private int idEntrador;
	private String nombre;
	private String pass;
	private double pokedollares;
	private LinkedList<Pokemon> equipoPrincipal;
	private LinkedList<Pokemon> pokemonCaja;
	
	
	public Entrenador(int idEntrador, String nombre, String pass, double pokedollares,
			LinkedList<Pokemon> equipoPrincipal, LinkedList<Pokemon> pokemonCaja) {
		super();
		this.idEntrador = idEntrador;
		this.nombre = nombre;
		this.pass = pass;
		this.pokedollares = pokedollares;
		this.equipoPrincipal = equipoPrincipal;
		this.pokemonCaja = pokemonCaja;
	}


	public Entrenador(String usuario, String pass2) {
		super();
		this.idEntrador = 0;
		this.nombre = usuario;
		this.pass = pass2;
		this.pokedollares = 0;
		this.equipoPrincipal = new LinkedList<Pokemon>();
		this.pokemonCaja = new LinkedList<Pokemon>();
	}


	public int getIdEntrador() {
		return idEntrador;
	}


	public void setIdEntrador(int idEntrador) {
		this.idEntrador = idEntrador;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public double getPokedollares() {
		return pokedollares;
	}


	public void setPokedollares(double pokedollares) {
		this.pokedollares = pokedollares;
	}


	public LinkedList<Pokemon> getEquipoPrincipal() {
		return equipoPrincipal;
	}


	public void setEquipoPrincipal(LinkedList<Pokemon> equipoPrincipal) {
		this.equipoPrincipal = equipoPrincipal;
	}


	public LinkedList<Pokemon> getPokemonCaja() {
		return pokemonCaja;
	}


	public void setPokemonCaja(LinkedList<Pokemon> pokemonCaja) {
		this.pokemonCaja = pokemonCaja;
	}


	@Override
	public String toString() {
		return "Entrenador [idEntrador=" + idEntrador + ", nombre=" + nombre + ", pass=" + pass + ", pokedollares="
				+ pokedollares + ", equipoPrincipal=" + equipoPrincipal + ", pokemonCaja=" + pokemonCaja + "]";
	}
	
	
	
	
}
