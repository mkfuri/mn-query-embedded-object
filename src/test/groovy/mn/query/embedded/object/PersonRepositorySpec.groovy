package mn.query.embedded.object

import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
class PersonRepositorySpec extends Specification {

    @Inject
    PersonRepository personRepository

    def "test save and update"(){
        given:
        Address address = new Address(name: "foo", number: "333")

        and:
        Person person = new Person(name: "Goo", address:  address)

        when:
        person = personRepository.save(person)

        then:
        person
        person.id
        person.address

        when:
        def person2 = personRepository.findById(person.id).get()

        then:
        person2.name == "Noo"
        person2.address
    }
}
