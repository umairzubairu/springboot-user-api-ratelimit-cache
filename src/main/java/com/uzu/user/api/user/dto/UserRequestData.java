package com.uzu.user.api.user.dto;

import java.time.Instant;
import java.util.concurrent.atomic.AtomicInteger;
import lombok.*;

@Data
public class UserRequestData {
    AtomicInteger requests = new AtomicInteger(0);
    Instant resetTime = Instant.now().plusSeconds(60);
}