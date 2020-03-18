package model;

import androidx.appcompat.app.AppCompatActivity; // TODO Model skal være uafhængig af Android og view

public class ModelClass extends AppCompatActivity /* TODO Kun activities behøver at nedarve fra AppCompatActivity */ {

    public String data; // TODO Sørg for at datakernen er indkapslet
    
    // TODO ModelClass skal stille metoder til rådighed som viewet kan benytte, fx til set og get

    @Override // TODO Når klassen ikke nedarver fra AppCompatActivtiy så bliver der ikke noget at override
    public /* TODO Metoder skal have en returtype */ getView(View view)  {

    }

}
