package com.geekster.Randomjokes.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class JokesController {
  static  ArrayList<String> jokesList= new ArrayList<>();
  @PostMapping(value="/jokes")
  public String saveJokes(@RequestBody String jokes){
      jokesList.add(jokes);
      return "joke saved " + jokes ;
  }

    @GetMapping(value="/jokes")
    public String getJokes(){

        jokesList.add("Why don’t pirates take a shower before they walk the plank?\n" +
                "\n" +
                "They just wash up on shore.");
        jokesList.add("One of the oddities of Wall Street is that it is the dealer and not the customer who is called broker. —Dallas News");
        jokesList.add("A grasshopper walks into a bar. The bartender looks at him and says, “Hey, they named a drink after you!”\n" +
                "\n" +
                "“Really?” replies the grasshopper. “There’s a drink named Stan?”");
        jokesList.add("You can’t believe everything you hear—but you can repeat it.");
        jokesList.add("I haven’t anything valuable, madam,” answered the maid. “But thanks for the warning just the same");


        int randomNumber=0+ (int)(Math.random()*((jokesList.size()-1-0)+1));
        return jokesList.get(randomNumber);

    }
}
