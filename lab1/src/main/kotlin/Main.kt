fun main(args: Array<String>) {
    val mobilePhone = MobilePhone()

    println("\nNew contact: ")
    mobilePhone.addNewContact(Contact("Angelina", "78935837571"))
    mobilePhone.addNewContact(Contact("Ivan", "78935334576"))
    mobilePhone.addNewContact(Contact("Roman", "79551234545"))
    mobilePhone.addNewContact(Contact("Oleg", "79953421111"))
    mobilePhone.printContacts()

    println("\n Editing contact: ")
    mobilePhone.updateContact(Contact("Oleg", "79953421111"), Contact("Oleg", "79953425555"))
    mobilePhone.printContacts()

    println("\nRemove: ")
    mobilePhone.removeContact(Contact("Roman", "+7-954-945-36-43"))
    println("contact deleted!")
    mobilePhone.printContacts()

    println("\nsearch contact: ")
    val status = mobilePhone.findContact(Contact("Angelina", "79835837571"))
    if (status >= 0) {
        println("the contact exists")
    }
    else {
        println("the contact does not exist")
    }

    println("\nSearch for a contact by name : ")
    val foundContact = mobilePhone.queryContact("Irina")
    if (foundContact != null) {
        println("${foundContact.name} " +
                "\n${foundContact.phoneNumber}")
    }
    else {
        println("the contact does not exist")
    }
}