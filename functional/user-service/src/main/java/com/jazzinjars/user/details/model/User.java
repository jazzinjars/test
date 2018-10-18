package com.jazzinjars.user.details.model;

import lombok.Value;

@Value(staticConstructor = "of")
public class User {
    UserDetails userDetails;
    UserContacts userContacts;
}
