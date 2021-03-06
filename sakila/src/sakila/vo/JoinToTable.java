package sakila.vo;

public class JoinToTable {
	private Address address;
	private Film film;
	private Actor actor;
	private City city;
	private Country country;
	private Rental rental;
	private Customer customer;
	private Staff staff;
	private FilmList filmList;
	private Language language;
	private Category category;
	private Payment payment;
	
	public Actor getActor() {
		return actor;
	}
	public void setActor(Actor actor) {
		this.actor = actor;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Film getFilm() {
		return film;
	}
	public void setFilm(Film film) {
		this.film = film;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public Rental getRental() {
		return rental;
	}
	public void setRental(Rental rental) {
		this.rental = rental;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	public FilmList getFilmList() {
		return filmList;
	}
	public void setFilmList(FilmList filmList) {
		this.filmList = filmList;
	}
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	@Override
	public String toString() {
		return "JoinToTable [address=" + address + ", film=" + film + ", actor=" + actor + ", city=" + city
				+ ", country=" + country + ", rental=" + rental + ", customer=" + customer + ", staff=" + staff
				+ ", filmList=" + filmList + ", language=" + language + ", category=" + category + ", payment="
				+ payment + "]";
	}
}
