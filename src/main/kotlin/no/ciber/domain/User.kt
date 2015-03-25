package no.ciber.domain

import org.hibernate.validator.constraints.Length
import org.springframework.data.mapping.model.AbstractPersistentProperty
import java.util.ArrayList
import java.util.UUID
import javax.persistence.*
import javax.validation.constraints.NotNull

Entity
Table(
        uniqueConstraints = array(
                UniqueConstraint(columnNames = * array( "email"))
        )
)
data public class User (
        Id GeneratedValue var id: String? = null,
        NotNull Length(max = 32) var email: String? = null,
        NotNull Length(max = 16) var firstname: String? = null,
        NotNull Length(max = 16)var lastname: String? = null,
        var interests: ArrayList<String>? = null
)