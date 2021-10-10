package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List <MovieModel> movie=getMovies();
        Movie_List_Adapter MAdapter=new Movie_List_Adapter(movie);
        RecyclerView recyclerView=findViewById(R.id.recycler);
        recyclerView.setAdapter(MAdapter);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);






        }




    private List<MovieModel> getMovies(){
        ArrayList<MovieModel> Movie=new ArrayList<>();
        Movie.add(new MovieModel("No Time to Die","No Time to Die is a 2021 spy film and the 25th in the James Bond series produced by Eon Productions. It stars Daniel Craig in his fifth and final outing as the fictional British MI6 agent James Bond. It is directed by Cary Joji Fukunaga from a screenplay by Neal Purvis, Robert Wade, Fukunaga and Phoebe Waller-Bridge. Léa Seydoux, Ben Whishaw, Naomie Harris, Jeffrey Wright, Christoph Waltz, Rory Kinnear and Ralph Fiennes reprise their roles from previous films, with Rami Malek, Lashana Lynch, Billy Magnussen, Ana de Armas, David Dencik and Dali Benssalah also starring. In this film, Bond, who has left active service with MI6, is recruited by the CIA to rescue a kidnapped scientist, which leads to a showdown with a powerful adversary"));
        Movie.add(new MovieModel("Don't Breathe 2","Don't Breathe 2 is a 2021 American horror thriller film directed by Rodo Sayagues in his directorial debut, from a screenplay he co-wrote with Fede Álvarez, the director of the first film, 2016's Don't Breathe. The sequel is produced by Álvarez, Sam Raimi, and Robert Tapert, and stars Stephen Lang, reprising his role as Norman Nordstrom / \"The Blind Man\", with Brendan Sexton III and Madelyn Grace in supporting roles."));
        Movie.add(new MovieModel("The Addams Family 2 ","The Addams Family 2 is a 2021 computer-animated supernatural road black comedy film directed by Greg Tiernan and Conrad Vernon, co-directed by Laura Brousseau and Kevin Pavlovic,[4] written by Dan Hernandez, Benji Samit, Ben Queen, and Susanna Fogel with a story by Hernandez and Samit,[5] and based on the characters created by Charles Addams.[6] It is the sequel to the 2019 film, The Addams Family, and stars the voices of Oscar Isaac, Charlize Theron, Chloë Grace Moretz, Nick Kroll, Javon Walton, Wallace Shawn, Snoop Dogg, Bette Midler, and Bill Hader. It tells the story of the Addams family as they go on a road trip"));
        Movie.add(new MovieModel("Dune","Dune titled onscreen as Dune: Part One)[5] is a 2021 American epic science fiction film directed by Denis Villeneuve with a screenplay by Jon Spaihts, Villeneuve, and Eric Roth. It is the first of a planned two-part adaptation of the 1965 novel of the same name by Frank Herbert, primarily covering the first half of the book. Set in the far future, it follows Paul Atreides, as he and his family, the noble House Atreides, are thrust into a war for the dangerous desert planet Arrakis, between the native Fremen people and the enemy invaders, the House Harkonnen. The film stars an ensemble cast including Timothée Chalamet, Rebecca Ferguson, Oscar Isaac, Josh Brolin, Stellan Skarsgård, Dave Bautista, Stephen McKinley Henderson, Zendaya, David Dastmalchian, Chang Chen, Sharon Duncan-Brewster, Charlotte Rampling, Jason Momoa, and Javier Bardem."));
        Movie.add(new MovieModel("Midnight in the Switchgrass ","Midnight in the Switchgrass is a 2021 American crime thriller film directed by Randall Emmett in his directorial debut, from a screenplay by Alan Horsnail. It stars Megan Fox, Bruce Willis, Emile Hirsch, Lukas Haas, Colson Baker and Lydia Hull." ));
        Movie.add(new MovieModel("Shang-Chi and the Legend of the Ten Rings","Shang-Chi and the Legend of the Ten Rings is a 2021 American superhero film based on Marvel Comics featuring the character Shang-Chi. Produced by Marvel Studios and distributed by Walt Disney Studios Motion Pictures, it is the 25th film in the Marvel Cinematic Universe (MCU). The film is directed by Destin Daniel Cretton, from a screenplay he wrote with Dave Callaham and Andrew Lanham, and stars Simu Liu as Shang-Chi alongside Awkwafina, Meng'er Zhang, Fala Chen, Florian Munteanu, Benedict Wong, Michelle Yeoh, Ben Kingsley, and Tony Leung. In the film, Shang-Chi is forced to confront his past when his father Wenwu (Leung), the leader of the Ten Rings organization, draws Shang-Chi and his sister Xialing (Zhang) into a search for a mythical village."));
        Movie.add(new MovieModel("Free Guy ","Free Guy is a 2021 American science fiction action comedy film directed by Shawn Levy from a screenplay by Matt Lieberman and Zak Penn, and a story by Lieberman. The film stars Ryan Reynolds as a bank teller, named Guy, who discovers that he is actually a non-player character in an open-world video game and becomes the hero of the story, trying to save his friends from deletion by the game's creator. Jodie Comer, Joe Keery, Lil Rel Howery, Utkarsh Ambudkar, and Taika Waititi also star in the film."));
        Movie.add(new MovieModel("Every Breath You Take","Every Breath You Take, also known as You Belong to Me, is a 2021 American psychological thriller film directed by Vaughn Stein and written by David Murray. It stars Casey Affleck, Michelle Monaghan, Sam Claflin, and Veronica Ferres. It follows the psychiatrist, whose life is disrupted when his client's brother introduces him to his family following the death of the psychiatrist's client."));
        Movie.add(new MovieModel("The Virtuoso","The Virtuoso is a 2021 American neo-noir crime thriller film directed and produced by Nick Stagliano. The film stars Anson Mount, Abbie Cornish, Eddie Marsan, Richard Brake, David Morse, and Anthony Hopkins. It follows a professional assassin who must track down and kill his latest target to satisfy an outstanding debt to his mentor"));
        Movie.add(new MovieModel("Queen of Spades","According to legend, an ominous entity known as the Queen of Spades can be summoned by performing an ancient ritual. "));
        Movie.add(new MovieModel ("Malignant","Malignant: Directed by James Wan. With Annabelle Wallis, Maddie Hasson, George Young, Michole Briana White."));
        Movie.add(new MovieModel("30 March", "30 March: Directed by Ahmed Khaled. With Ahmad El-Fishawi, Dina El Sherbiny, Khaled El-Sawi, Sabry Fawwaz. Ali"));
        Movie.add(new MovieModel("Midnight in the Switchgrass","Midnight in the Switchgrass: Directed by Randall Emmett. With Emile Hirsch, Megan Fox, Bruce Willis, Lukas Haas"));
        Movie.add(new MovieModel("The Humans and the Mongoose ","he Humans and the Mongoose ... The story follows a poor government employee who lands in a lot of trouble because of his father's profession"));
        Movie.add(new MovieModel("Mako","Inspired by a true story, the events revolve around the ferry Salem Express, as eight people decide to dive in the depths of the Red Sea, bringing back lots of memories."));
        Movie.add(new MovieModel("Arousty","The story follows a young man and woman who go through various situations in their journey to find the right partner,"));
        return Movie;






    }
}