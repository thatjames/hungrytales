package xyz.slimjim.hungrytales.common.recipe;

import xyz.slimjim.hungrytales.common.dataobject.DataObject;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Recipe extends DataObject {

    private int id;
    private String author;
    private String title;
    private LocalDateTime createdDatetime;
    private boolean isVegetarian;
    private int feeds;
    private List<Ingredient> ingredients;
    private List<Instruction> instructions;

    public Recipe() {
        ingredients = new ArrayList<>();
        instructions = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(LocalDateTime createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    public void setCreatedDatetime(String createdDatetime) {
        this.createdDatetime = LocalDateTime.parse(createdDatetime, DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
    }

    public void setCreatedDatetime(Integer unixTimestamp) {
        this.createdDatetime = LocalDateTime.ofInstant(Instant.ofEpochSecond(unixTimestamp.longValue()), ZoneId.systemDefault());
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    public int getFeeds() {
        return feeds;
    }

    public void setFeeds(int feeds) {
        this.feeds = feeds;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Instruction> getInstructions() {
        Collections.sort(instructions);
        return instructions;
    }

    public void setInstructions(List<Instruction> instructions) {
        this.instructions = instructions;
    }

    @Override
    public String toString() {
        return "RecipeItem{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", createdDatetime=" + createdDatetime +
                ", isVegetarian=" + isVegetarian +
                ", feeds=" + feeds +
                ", ingredients=" + ingredients +
                ", instructions=" + instructions +
                '}';
    }
}
