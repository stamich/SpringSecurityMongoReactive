package io.codecity.securitymanager.model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.SortedSet;
import java.util.TreeSet;

@Data
@Document(collection = "users")
public class Users {

    public enum Type {
        INDIVIDUAL,
        SMALL_BUSINESS,
        LIMITED_PARTNERSHIP,
        JOINT_STOCK_COMPANY,
        CORPORATE
    }

    @Id
    private ObjectId _id;

    @Field(order = 1)
    private String firstName;

    @Field(order = 2)
    private String lastName;

    @Field(order = 3)
    private String email;

    @Field(order = 4)
    private String password;

    @Field(order = 6)
    private Boolean active;

    @Field(name = "user_type", order = 5)
    private SortedSet<Type> types = new TreeSet<>();
}
