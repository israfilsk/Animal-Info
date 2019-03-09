package com.example.animalname

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.zooapp.Animal
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.animal_ticket.view.*

class MainActivity : AppCompatActivity() {

    var listOfAnimals = ArrayList<Animal>()
    var adapter:AnimalsAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listOfAnimals.add(Animal("Aligator_Crocodile", "Wild life Animal",R.drawable.alligator_crocodile))
        listOfAnimals.add(Animal("Alpaca","Wild Life Animal",R.drawable.alpaca))
        listOfAnimals.add(Animal("Ant","Wild Life Animal",R.drawable.ant))
        listOfAnimals.add(Animal("Antelope","Wild Life Animal",R.drawable.antelope))
        listOfAnimals.add(Animal("Ape","Wild Life Animal",R.drawable.ape))
        listOfAnimals.add(Animal("Armadillo","Wild Life Animal",R.drawable.armadillo))
        listOfAnimals.add(Animal("Baboon","Wild Life Animal",R.drawable.baboon))
        listOfAnimals.add(Animal("Badger","Wild Life Animal",R.drawable.badger))
        listOfAnimals.add(Animal("Bat","Wild Life Animal",R.drawable.bat))
        listOfAnimals.add(Animal("Bear","Wild Life Animal",R.drawable.bear))
        listOfAnimals.add(Animal("Beaver","Wild Life Animal",R.drawable.beaver))
        listOfAnimals.add(Animal("Bee","Wild Life Animal",R.drawable.bee))
        listOfAnimals.add(Animal("Beetle","Wild Life Animal",R.drawable.beetle))
        listOfAnimals.add(Animal("Buffalo","Wild Life Animal",R.drawable.buffalo))
        listOfAnimals.add(Animal("Butterfly","Wild Life Animal",R.drawable.butterfly))
        listOfAnimals.add(Animal("Camel","Wild Life Animal",R.drawable.camel))
        listOfAnimals.add(Animal("Caribou","Wild Life Animal",R.drawable.caribou))
        listOfAnimals.add(Animal("Cat","Wild Life Animal",R.drawable.cat))
        listOfAnimals.add(Animal("Cattle","Wild Life Animal",R.drawable.cattle))
        listOfAnimals.add(Animal("Cheetah","Wild Life Animal",R.drawable.cheetah))
        listOfAnimals.add(Animal("Chimpanzee","Wild Life Animal",R.drawable.chimpanzee))
        listOfAnimals.add(Animal("Chinchilla","Wild Life Animal",R.drawable.chinchilla))
        listOfAnimals.add(Animal("Coyote","Wild Life Animal",R.drawable.coyote))
        listOfAnimals.add(Animal("Deer","Wild Life Animal",R.drawable.deer))
        listOfAnimals.add(Animal("Dinosour","Wild Life Animal",R.drawable.dinosour))
        listOfAnimals.add(Animal("Dog","Wild Life Animal",R.drawable.dog))
        listOfAnimals.add(Animal("Donkey","Wild Life Animal",R.drawable.donkey))
        listOfAnimals.add(Animal("Elephant","Wild Life Animal",R.drawable.elephant))
        listOfAnimals.add(Animal("Elk","Wild Life Animal",R.drawable.elk))
        listOfAnimals.add(Animal("Ferret","Wild Life Animal",R.drawable.ferret))
        listOfAnimals.add(Animal("Fox","Wild Life Animal",R.drawable.fox))
        listOfAnimals.add(Animal("Giraffe","Wild Life Animal",R.drawable.giraffe))
        listOfAnimals.add(Animal("Goat","Wild Life Animal",R.drawable.goat))
        listOfAnimals.add(Animal("Guinea_pig","Wild Life Animal",R.drawable.guinea_pig))
        listOfAnimals.add(Animal("Hamster","Wild Life Animal",R.drawable.hamster))
        listOfAnimals.add(Animal("Hare","Wild Life Animal",R.drawable.hare))
        listOfAnimals.add(Animal("Hedgehog","Wild Life Animal",R.drawable.hedgehog))
        listOfAnimals.add(Animal("Hippopotamus","Wild Life Animal",R.drawable.hippopotamus))
        listOfAnimals.add(Animal("Hornet","Wild Life Animal",R.drawable.hornet))
        listOfAnimals.add(Animal("Horse","Wild Life Animal",R.drawable.horse))
        listOfAnimals.add(Animal("Hound","Wild Life Animal",R.drawable.hound))
        listOfAnimals.add(Animal("Hyena","Wild Life Animal",R.drawable.hyena))
        listOfAnimals.add(Animal("Impala","Wild Life Animal",R.drawable.impala))
        listOfAnimals.add(Animal("Jackal","Wild Life Animal",R.drawable.jackal))
        listOfAnimals.add(Animal("Kangaroo","Wild Life Animal",R.drawable.kangaroo))
        listOfAnimals.add(Animal("Koala","Wild Life Animal",R.drawable.koala))
        listOfAnimals.add(Animal("Leopard","Wild Life Animal",R.drawable.leopard))
        listOfAnimals.add(Animal("Lion","Wild Life Animal",R.drawable.lion))
        listOfAnimals.add(Animal("Llama","Wild Life Animal",R.drawable.llama))
        listOfAnimals.add(Animal("Mammoth","Wild Life Animal",R.drawable.mammoth))
        listOfAnimals.add(Animal("Marten","Wild Life Animal",R.drawable.marten))
        listOfAnimals.add(Animal("Mink","Wild Life Animal",R.drawable.mink))
        listOfAnimals.add(Animal("Mole","Wild Life Animal",R.drawable.mole))
        listOfAnimals.add(Animal("Monkey","Wild Life Animal",R.drawable.monkey))
        listOfAnimals.add(Animal("Moose","Wild Life Animal",R.drawable.moose))
        listOfAnimals.add(Animal("Mouse","Wild Life Animal",R.drawable.mouse))
        listOfAnimals.add(Animal("Mule","Wild Life Animal",R.drawable.mule))
        listOfAnimals.add(Animal("Muskrat","Wild Life Animal",R.drawable.muskrat))
        listOfAnimals.add(Animal("Otter","Wild Life Animal",R.drawable.otter))
        listOfAnimals.add(Animal("Ox","Wild Life Animal",R.drawable.ox))
        listOfAnimals.add(Animal("Panda","Wild Life Animal",R.drawable.panda))
        listOfAnimals.add(Animal("Pig","Wild Life Animal",R.drawable.pig))
        listOfAnimals.add(Animal("Platypus","Wild Life Animal",R.drawable.platypus))
        listOfAnimals.add(Animal("Porcupine","Wild Life Animal",R.drawable.porcupine))
        listOfAnimals.add(Animal("Prairie_Dog","Wild Life Animal",R.drawable.prairie_dog))
        listOfAnimals.add(Animal("Pug","Wild Life Animal",R.drawable.pug))
        listOfAnimals.add(Animal("Rabbit","Wild Life Animal",R.drawable.rabbit))
        listOfAnimals.add(Animal("Raccoon","Wild Life Animal",R.drawable.raccoon))
        listOfAnimals.add(Animal("Reindeer","Wild Life Animal",R.drawable.reindeer))
        listOfAnimals.add(Animal("Rhinoceros","Wild Life Animal",R.drawable.rhinoceros))
        listOfAnimals.add(Animal("Serval","Wild Life Animal",R.drawable.serval))
        listOfAnimals.add(Animal("Sheep","Wild Life Animal",R.drawable.sheep))
        listOfAnimals.add(Animal("Skunk","Wild Life Animal",R.drawable.skunk))
        listOfAnimals.add(Animal("Squirrel","Wild Life Animal",R.drawable.squirrel))
        listOfAnimals.add(Animal("Termite","Wild Life Animal",R.drawable.termite))
        listOfAnimals.add(Animal("Tiger","Wild Life Animal",R.drawable.tiger))
        listOfAnimals.add(Animal("Walrus","Wild Life Animal",R.drawable.walrus))
        listOfAnimals.add(Animal("Wasp","Wild Life Animal",R.drawable.wasp))
        listOfAnimals.add(Animal("Water_Buffalo","Wild Life Animal",R.drawable.water_buffalo))
        listOfAnimals.add(Animal("Weasel","Wild Life Animal",R.drawable.weasel))
        listOfAnimals.add(Animal("Wildebeest","Wild Life Animal",R.drawable.wildebeest))
        listOfAnimals.add(Animal("Wolf","Wild Life Animal",R.drawable.wolf))
        listOfAnimals.add(Animal("Wombat","Wild Life Animal",R.drawable.wombat))
        listOfAnimals.add(Animal("Woodchuck","Wild Life Animal",R.drawable.woodchuck))
        listOfAnimals.add(Animal("Yak","Wild Life Animal",R.drawable.yak))
        listOfAnimals.add(Animal("Yellowjacket","Wild Life Animal",R.drawable.yellowjacket))
        listOfAnimals.add(Animal("Zebra","Wild Life Animal",R.drawable.zebra))


        adapter = AnimalsAdapter(this,listOfAnimals)
        listViewid.adapter = adapter

    }

    class AnimalsAdapter:BaseAdapter {

        var listOfAnimals= ArrayList<Animal>()//list of animal
        var context: Context?=null

        constructor(context: Context, listOfAnimals : ArrayList<Animal>):super(){

            this.listOfAnimals= listOfAnimals
            this.context = context
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

            var animal = listOfAnimals[position]

                //view
                var inflator = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
                var myView = inflator.inflate(R.layout.animal_ticket, null)
                myView.name.text = animal.name!!

                myView.imageView.setImageResource(animal.image!!)

                myView.imageView.setOnClickListener {

                    val intent = Intent(context,AnimalInfo::class.java)
                    intent.putExtra("name",animal.name!!)
                    intent.putExtra("des",animal.des!!)
                    intent.putExtra("image",animal.image!!)

                    context!!.startActivity(intent)

                }

            return myView

        }

        override fun getItem(position: Int): Any {
            return listOfAnimals[position]

        }

        override fun getItemId(position: Int): Long {
            return position.toLong()

        }

        override fun getCount(): Int {
            return listOfAnimals.count()

        }
    }
}
