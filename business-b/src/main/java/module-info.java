module org.my.group.buisnessB {

	requires org.my.group.buisnessA;
	requires jakarta.enterprise.cdi.api;
	requires jakarta.inject.api;
	requires java.ws.rs;

	exports org.my.group.b;
}