package model;
public abstract class Person {
	//Atributes
	private String name;
	private String last_name;
	private String identification;
	//Methods
	/**
	*Person builder
	*@param name != null
	*@param last_name != null
	*@param identification != null
	*/
	public Person(String name, String last_name, String identification){
		this.name=name;
		this.last_name=last_name;
		this.identification=identification;
	}
	public Person(){
		name="?????";
		last_name="?????";
		identification="?????";
	}
	/** getName
	     * Method to provide the name
	     * @return String name
	     */
	public String getName(){
		return name;
	}
	/** setName
	     * Method to changes the name
	     * @param name -!= null
	     */
	public void setName(String name){
		this.name=name;
	}
	/** getLast_name
	     * Method to provide the last name
	     * @return String last name
	     */
	public String getLast_name(){
		return last_name;
	}
	/** setLast_name
	     * Method to changes the last name
	     * @param last_name -!= null
	     */
	public void setLast_name(String last_name) {
		this.last_name=last_name;
	}
	/** getIdentification
	     * Method to provide the identification
	     * @return String indentification
	     */
	public String getIdentification(){
		return identification;
	}
	/** setIdentification
	     * Method to changes the identification
	     * @param indentification -!= null
	     */
	public void setIdentification(String identification) {
		this.identification=identification;
	}

}