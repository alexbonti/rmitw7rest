package dev.rmit.w7rest.model;

import org.springframework.data.annotation.Id;

public record Product(@Id Integer id, String name, Integer price) {
}
