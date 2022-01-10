data class Participant(val fName: String, val sName: String, val rL: String, var age: Int) :
    User(name = fName, surname = sName, role = rL) {

}
