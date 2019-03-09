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

        listOfAnimals.add(Animal("Aligator_Crocodile",
                "Crocodiles or true crocodiles are large aquatic" +
                    " reptiles that live throughout the tropics in Africa, Asia, " +
                    "the Americas and Australia. Crocodylinae, all of whose " +
                    "members are considered true crocodiles, is classified as a " +
                    "biological subfamily."
            ,R.drawable.alligator_crocodile))


        listOfAnimals.add(Animal("Alpaca",
                "The alpaca is a species of South American camelid. " +
                    "It is similar to, and often confused with, the " +
                    "llama. However, alpacas are often noticeably " +
                    "smaller than llamas. The two animals are " +
                    "closely related and can successfully cross-breed."
            ,R.drawable.alpaca))



        listOfAnimals.add(Animal("Ant",
                "Ants are eusocial insects of the family " +
                    "Formicidae and, along with the related wasps " +
                    "and bees, belong to the order Hymenoptera. " +
                    "Ants evolved from wasp-like ancestors in the " +
                    "Cretaceous period, about 140 million years ago," +
                    " and diversified after the rise of flowering plants."
            ,R.drawable.ant))


        listOfAnimals.add(Animal("Antelope",
                "An antelope is a member of a number of even-toed " +
                    "ungulate species indigenous to various regions in " +
                    "Africa and Eurasia."
            ,R.drawable.antelope))

        listOfAnimals.add(Animal("Ape",
                "Apes are a branch of Old World tailless anthropoid" +
                    " primates native to Africa and Southeast Asia. " +
                    "They are the sister group of the Old World monkeys, " +
                    "together forming the catarrhine clade."
            ,R.drawable.ape))


        listOfAnimals.add(Animal("Armadillo",
                "Armadillos are New World placental " +
                    "mammals in the order Cingulata. " +
                    "The Chlamyphoridae and Dasypodidae " +
                    "are the only surviving families in the order," +
                    " which is part of the superorder Xenarthra, " +
                    "along with the anteaters and sloths."
            ,R.drawable.armadillo))


        listOfAnimals.add(Animal("Baboon",
                "Baboons are primates comprising " +
                    "the genus Papio, one of the 23 " +
                    "genuses of Old World monkeys. " +
                    "The common names of the five species " +
                    "of baboons are the hamadryas, the Guinea," +
                    " the olive, the yellow, and the chacma baboons."
            ,R.drawable.baboon))


        listOfAnimals.add(Animal("Badger",
                "Badgers are short-legged omnivores " +
                    "in the family Mustelidae, which also " +
                    "includes the otters, polecats, weasels, " +
                    "and wolverines. They belong to the caniform " +
                    "suborder of carnivoran mammals. The 11 species " +
                    "of badgers are grouped in three subfamilies:" +
                    " Melinae, Mellivorinae, and Taxideinae. "
            ,R.drawable.badger))


        listOfAnimals.add(Animal("Bat",
                "Bats are mammals of the order Chiroptera; " +
                    "with their forelimbs adapted as wings, " +
                    "they are the only mammals naturally " +
                    "capable of true and sustained flight." +
                    " Bats are more manoeuvrable than birds, " +
                    "flying with their very long spread-out " +
                    "digits covered with a thin membrane or patagium."
            ,R.drawable.bat))


        listOfAnimals.add(Animal("Bear",
                "Bears are carnivoran mammals of the family Ursidae. " +
                    "They are classified as caniforms, or " +
                    "doglike carnivorans. Although only eight " +
                    "species of bears are extant, they are widespread," +
                    " appearing in a wide variety of habitats throughout " +
                    "the Northern Hemisphere and partially in the Southern Hemisphere."
            ,R.drawable.bear))


        listOfAnimals.add(Animal("Beaver",
                "The beaver is a large, primarily nocturnal," +
                    " semiaquatic rodent. Castor includes two extant " +
                    "species, the North American beaver and Eurasian beaver. " +
                    "Beavers are known for building dams, canals, and lodges." +
                    " They are the second-largest rodent in the world."
            ,R.drawable.beaver))


        listOfAnimals.add(Animal("Bee",
                "Bees are flying insects closely related to wasps and ants," +
                    " known for their role in pollination and, in the case of " +
                    "the best-known bee species, the western honey bee, for " +
                    "producing honey and beeswax. Bees are a monophyletic " +
                    "lineage within the superfamily Apoidea and are presently " +
                    "considered a clade, called Anthophila."
            ,R.drawable.bee))


        listOfAnimals.add(Animal("Beetle",
                "Beetles are a group of insects that form the order Coleoptera, " +
                    "in the superorder Endopterygota. Their front pair of wings " +
                    "are hardened into wing-cases, elytra, distinguishing them " +
                    "from most other insects."
            ,R.drawable.beetle))


        listOfAnimals.add(Animal("Buffalo",
                "The buffalo or domestic water buffalo is a large bovid originating " +
                    "in South Asia, Southeast Asia, and China. Today, it is also found " +
                    "in Europe, Australia, North America, South America and some African countries."
            ,R.drawable.buffalo))


        listOfAnimals.add(Animal("Butterfly",
            "Butterflies are insects in the macrolepidopteran clade Rhopalocera from " +
                    "the order Lepidoptera, which also includes moths. Adult butterflies " +
                    "have large, often brightly coloured wings, and conspicuous, fluttering flight."
            ,R.drawable.butterfly))


        listOfAnimals.add(Animal("Camel",
                "A camel is an even-toed ungulate in the genus " +
                    "Camelus that bears distinctive fatty deposits " +
                    "known as humps on its back. Camels have long " +
                    "been domesticated and, as livestock, they provide " +
                    "food and textiles."
            ,R.drawable.camel))


        listOfAnimals.add(Animal("Caribou",
                "The reindeer, also known as the caribou in North " +
                    "America, is a species of deer with circumpolar" +
                    " distribution, native to Arctic, sub-Arctic, tundra, boreal," +
                    " and mountainous regions of northern Europe, Siberia, " +
                    "and North America. This includes both sedentary and migratory populations."
            ,R.drawable.caribou))


        listOfAnimals.add(Animal("Cat",
                "The cat or domestic cat is a small carnivorous mammal. " +
                    "It is the only domesticated species in the family Felidae. " +
                    "The cat is either a house cat, kept as a pet, or a feral cat," +
                    " freely ranging and avoiding human contact. A house cat is " +
                    "valued by humans for companionship and for its ability to hunt rodents."
            ,R.drawable.cat))


        listOfAnimals.add(Animal("Cattle",
                "Cattle—colloquially cows—are the most common type of " +
                    "large domesticated ungulates. They are a prominent " +
                    "modern member of the subfamily Bovinae, are the most " +
                    "widespread species of the genus Bos, and are most commonly " +
                    "classified collectively as Bos taurus."
            ,R.drawable.cattle))


        listOfAnimals.add(Animal("Cheetah",
                "The cheetah is a large cat of the subfamily Felinae that " +
                    "occurs in North, Southern and East Africa, and a few " +
                    "localities in Iran. It inhabits a variety of mostly " +
                    "arid habitats like dry forests, scrub forests, and savannahs."
            ,R.drawable.cheetah))


        listOfAnimals.add(Animal("Chimpanzee",
                "The genus Pan consists of two extant species: " +
                    "the common chimpanzee and the bonobo. Taxonomically, " +
                    "these two ape species are collectively termed panins; " +
                    "however, both species are more commonly referred to collectively " +
                    "using the generalized term chimpanzees, or chimps."
            ,R.drawable.chimpanzee))


        listOfAnimals.add(Animal("Chinchilla",
                "Chinchillas are either of two species of crepuscular rodents of the " +
                    "parvorder Caviomorpha. They are slightly larger and more robust " +
                    "than ground squirrels, and are native to the Andes mountains in " +
                    "South America. They live in colonies called herds at high " +
                    "elevations of up to 4,270 m."
            ,R.drawable.chinchilla))


        listOfAnimals.add(Animal("Coyote",
                "The coyote, Canis latrans, is a canine native to North America. " +
                    "It is smaller than its close relative, the gray wolf, " +
                    "and slightly smaller than the closely related eastern wolf and red wolf."
            ,R.drawable.coyote))


        listOfAnimals.add(Animal("Deer",
                "Deer are the hoofed ruminant mammals forming the family Cervidae. " +
                    "The two main groups are the Cervinae, including the muntjac, " +
                    "the elk, the fallow deer, and the chital; and the Capreolinae, " +
                    "including the reindeer, the roe deer, and the moose."
            ,R.drawable.deer))


        listOfAnimals.add(Animal("Dinosour",
                "Dinosaurs are a diverse group of reptiles of the clade Dinosauria." +
                    " They first appeared during the Triassic period, " +
                    "between 243 and 233.23 million years ago, although " +
                    "the exact origin and timing of the evolution of " +
                    "dinosaurs is the subject of active research."
            ,R.drawable.dinosour))


        listOfAnimals.add(Animal("Dog",
                "The domestic dog is a member of the genus Canis, " +
                    "which forms part of the wolf-like canids, " +
                    "and is the most widely abundant terrestrial carnivore."
            ,R.drawable.dog))


        listOfAnimals.add(Animal("Donkey",
                "The donkey or ass is a domesticated member of the " +
                    "horse family, Equidae. The wild ancestor of " +
                    "the donkey is the African wild ass, E. africanus." +
                    " The donkey has been used as a working animal " +
                    "for at least 5000 years."
            ,R.drawable.donkey))


        listOfAnimals.add(Animal("Elephant",
                "The elephants are the large mammals forming the " +
                    "family Elephantidae in the order Proboscidea." +
                    " Three species are currently recognised: " +
                    "the African bush elephant, the African forest " +
                    "elephant, and the Asian elephant. Elephants are " +
                    "scattered throughout sub-Saharan Africa, South Asia, " +
                    "and Southeast Asia. "
            ,R.drawable.elephant))


        listOfAnimals.add(Animal("Elk",
                "The elk or wapiti is one of the largest species" +
                    " within the deer family, Cervidae, in the world," +
                    " and one of the largest terrestrial mammals in " +
                    "North America and Northeast Asia."
            ,R.drawable.elk))


        listOfAnimals.add(Animal("Ferret",
                "The ferret is the domesticated form of the European polecat," +
                    " a mammal belonging to the same genus as the weasel," +
                    " Mustela, in the family Mustelidae. Their fur is " +
                    "typically brown, black, white, or mixed."
            ,R.drawable.ferret))


        listOfAnimals.add(Animal("Fox",
                "Foxes are small-to-medium-sized, omnivorous mammals " +
                    "belonging to several genera of the family Canidae. " +
                    "Foxes have a flattened skull, upright triangular ears, " +
                    "a pointed, slightly upturned snout, and a long bushy tail. " +
                    "Twelve species belong to the monophyletic true foxes group of genus Vulpes. "
            ,R.drawable.fox))


        listOfAnimals.add(Animal("Giraffe",
                "The giraffe is a genus of African even-toed ungulate mammals," +
                    " the tallest living terrestrial animals and the largest ruminants."
            ,R.drawable.giraffe))


        listOfAnimals.add(Animal("Goat",
                "The domestic goat or simply goat is a subspecies of C." +
                    " aegagrus domesticated from the wild goat of Southwest " +
                    "Asia and Eastern Europe. The goat is a member of the animal " +
                    "family Bovidae and the goat—antelope subfamily Caprinae, " +
                    "meaning it is closely related to the sheep. There are over " +
                    "300 distinct breeds of goat."
            ,R.drawable.goat))


        listOfAnimals.add(Animal("Guinea_pig",
                "The guinea pig or domestic guinea pig, also known as " +
                    "cavy or domestic cavy, is a species of rodent " +
                    "belonging to the family Caviidae and the genus Cavia." +
                    " Despite their common name, guinea pigs are not native " +
                    "to Guinea, nor are they biologically related to pigs, " +
                    "and the origin of the name is still unclear."
            ,R.drawable.guinea_pig))


        listOfAnimals.add(Animal("Hamster",
                "Hamsters are rodents belonging to the subfamily Cricetinae," +
                    " which contains 18 species classified in seven genera. " +
                    "They have become established as popular small house pets. " +
                    "The best-known species of hamster is the golden or Syrian " +
                    "hamster, which is the type most commonly kept as pets."
            ,R.drawable.hamster))


        listOfAnimals.add(Animal("Hare",
                "Hares and jackrabbits are leporids belonging to the genus Lepus." +
                    " Hares are classified in the same family as rabbits." +
                    " They are similar in size and form to rabbits and have " +
                    "similar herbivorous diets, but generally have longer ears " +
                    "and live solitarily or in pairs."
            ,R.drawable.hare))


        listOfAnimals.add(Animal("Hedgehog",
                "A hedgehog is any of the spiny mammals of the subfamily " +
                    "Erinaceinae, in the eulipotyphlan family Erinaceidae." +
                    " There are seventeen species of hedgehog in five genera " +
                    "found through parts of Europe, Asia, and Africa, " +
                    "and in New Zealand by introduction."
            ,R.drawable.hedgehog))


        listOfAnimals.add(Animal("Hippopotamus",
                "The common hippopotamus, or hippo, is a large, " +
                    "mostly herbivorous, semiaquatic mammal native " +
                    "to sub-Saharan Africa. It is one of only two " +
                    "extant species in the family Hippopotamidae, " +
                    "the other being the pygmy hippopotamus. " +
                    "The name comes from the ancient Greek for river horse."
            ,R.drawable.hippopotamus))


        listOfAnimals.add(Animal("Hornet",
                "Hornets are the largest of the eusocial wasps, " +
                    "and are similar in appearance to their close " +
                    "relatives yellowjackets. Some species can " +
                    "reach up to 5.5 cm in length."
            ,R.drawable.hornet))


        listOfAnimals.add(Animal("Horse",
                "The horse is one of two extant subspecies of Equus ferus. " +
                    "It is an odd-toed ungulate mammal belonging to the " +
                    "taxonomic family Equidae. The horse has evolved over " +
                    "the past 45 to 55 million years from a small multi-toed creature," +
                    " Eohippus, into the large, single-toed animal of today."
            ,R.drawable.horse))


        listOfAnimals.add(Animal("Hound",
                "A hound is a type of hunting dog used by hunters to track or chase prey."
            ,R.drawable.hound))


        listOfAnimals.add(Animal("Hyena",
                "Hyenas or hyaenas are any feliform carnivoran mammals of the " +
                    "family Hyaenidae. With only four extant species, " +
                    "it is the fifth-smallest biological family in the Carnivora," +
                    " and one of the smallest in the class Mammalia. " +
                    "Despite their low diversity, hyenas are unique and vital " +
                    "components of most African ecosystems."
            ,R.drawable.hyena))


        listOfAnimals.add(Animal("Impala",
                "The impala; is a medium-sized antelope found in eastern and southern Africa. " +
                    "The sole member of the genus Aepyceros, it was first " +
                    "described to European audiences by German zoologist " +
                    "Hinrich Lichtenstein in 1812. Two subspecies are " +
                    "recognised—the common impala, and the larger and darker black-faced impala. "
            ,R.drawable.impala))


        listOfAnimals.add(Animal("Jackal",
                "Jackals are medium-sized omnivorous mammals of the genus Canis, " +
                    "which also includes wolves, coyotes and the domestic dog."
            ,R.drawable.jackal))


        listOfAnimals.add(Animal("Kangaroo",
                "The kangaroo is a marsupial from the family Macropodidae. " +
                    "In common use the term is used to describe the largest " +
                    "species from this family, especially those of the genus " +
                    "Macropus: the red kangaroo, antilopine kangaroo, eastern" +
                    " grey kangaroo, and western grey kangaroo. Kangaroos are " +
                    "indigenous to Australia."
            ,R.drawable.kangaroo))


        listOfAnimals.add(Animal("Koala",
                "The koala is an arboreal herbivorous marsupial native to Australia. " +
                    "It is the only extant representative of the family " +
                    "Phascolarctidae and its closest living relatives are the wombats, " +
                    "which comprise the family Vombatidae."
            ,R.drawable.koala))


        listOfAnimals.add(Animal("Leopard",
                "The leopard is one of the five extant species in the genus Panthera," +
                    " a member of the Felidae. The leopard occurs in a wide " +
                    "range in sub-Saharan Africa and parts of Asia. "
            ,R.drawable.leopard))


        listOfAnimals.add(Animal("Lion",
                "The lion is a species in the family Felidae; it is a muscular," +
                    " deep-chested cat with a short, rounded head, a reduced neck " +
                    "and round ears, and a hairy tuft at the end of its tail."
            ,R.drawable.lion))


        listOfAnimals.add(Animal("Llama",
                "The llama is a domesticated South American camelid," +
                    " widely used as a meat and pack animal by Andean " +
                    "cultures since the Pre-Columbian era. The height " +
                    "of a full-grown, full-size llama is 1.7 to 1.8 m tall " +
                    "at the top of the head, and can weigh between 130 and 200 kg." +
                    " At birth, a baby llama can weigh between 9 and 14 kg."
            ,R.drawable.llama))


        listOfAnimals.add(Animal("Mammoth",
                "A mammoth is any species of the extinct genus Mammuthus, " +
                    "one of the many genera that make up the order of trunked" +
                    " mammals called proboscideans. The various species of " +
                    "mammoth were commonly equipped with long, curved tusks and," +
                    " in northern species, a covering of long hair. "
            ,R.drawable.mammoth))


        listOfAnimals.add(Animal("Marten",
                "The martens constitute the genus Martes within the subfamily Mustelinae," +
                    " in the family Mustelidae. Martens are slender, agile animals, " +
                    "adapted to living in taigas, and are found in coniferous and " +
                    "northern deciduous forests across the Northern Hemisphere."
            ,R.drawable.marten))


        listOfAnimals.add(Animal("Mink",
                "Mink are dark-colored, semiaquatic, carnivorous mammals " +
                    "of the genera Neovison and Mustela, and part of the " +
                    "family Mustelidae which also includes weasels, otters and ferrets. " +
                    "There are two extant species referred to as mink: the " +
                    "American mink and the European mink."
            ,R.drawable.mink))


        listOfAnimals.add(Animal("Mole",
                "Moles are small mammals adapted to a subterranean lifestyle. " +
                    "They have cylindrical bodies; velvety fur; very small, " +
                    "inconspicuous ears and eyes; reduced hindlimbs; and short, " +
                    "powerful forelimbs with large paws adapted for digging."
            ,R.drawable.mole))


        listOfAnimals.add(Animal("Monkey",
                "Monkey is a common name that may refer to groups or species of mammals," +
                    " in part, the simians of infraorder Simiiformes." +
                    " The term is applied descriptively to groups of primates, " +
                    "such as families of new world monkeys and old world monkeys, " +
                    "yet can exclude the hominoids, also referred to as apes. "
            ,R.drawable.monkey))


        listOfAnimals.add(Animal("Moose",
                "The moose or elk, Alces alces is a member of the " +
                    "New World deer subfamily and is the largest and " +
                    "heaviest extant species in the Deer family. " +
                    "Moose are distinguished by the broad, palmate " +
                    "antlers of the males; other members of the deer " +
                    "family have antlers with a dendritic configuration."
            ,R.drawable.moose))


        listOfAnimals.add(Animal("Mouse",
                "The genus Mus refers to a specific genus of muroid rodents," +
                    " all typically called mice. However, the term mouse can " +
                    "also be applied to species outside of this genus."
            ,R.drawable.mouse))


        listOfAnimals.add(Animal("Mule",
                "A mule is the offspring of a male donkey and a female horse. " +
                    "Horses and donkeys are different species, with different" +
                    " numbers of chromosomes. Of the two first generation hybrids " +
                    "between these two species, a mule is easier to obtain than a hinny," +
                    " which is the offspring of a female donkey and a male horse."
            ,R.drawable.mule))


        listOfAnimals.add(Animal("Muskrat",
                "The muskrat, the only species in genus Ondatra and tribe Ondatrini," +
                    " is a medium-sized semiaquatic rodent native to " +
                    "North America and is an introduced species in parts of Europe," +
                    " Asia, and South America. The muskrat is found in wetlands " +
                    "over a wide range of climates and habitats."
            ,R.drawable.muskrat))


        listOfAnimals.add(Animal("Otter",
                "Otters are carnivorous mammals in the subfamily Lutrinae. " +
                    "The 13 extant otter species are all semiaquatic, " +
                    "aquatic or marine, with diets based on fish and invertebrates." +
                    " Lutrinae is a branch of the weasel family Mustelidae, " +
                    "which also includes badgers, honey badgers, martens, minks, " +
                    "polecats, and wolverines."
            ,R.drawable.otter))


        listOfAnimals.add(Animal("Ox",
                "An ox, also known as a bullock in Australia and India," +
                    " is a bovine trained as a draft animal or riding animal." +
                    " Oxen are commonly castrated adult male cattle; " +
                    "castration makes the animals more docile. " +
                    "Cows or bulls may also be used in some areas."
            ,R.drawable.ox))


        listOfAnimals.add(Animal("Panda",
                "The giant panda, also known as panda bear or simply panda, " +
                    "is a bear native to south central China. It is easily " +
                    "recognized by the large, distinctive black patches around its eyes," +
                    " over the ears, and across its round body. The name giant panda is" +
                    " sometimes used to distinguish it from the unrelated red panda."
            ,R.drawable.panda))


        listOfAnimals.add(Animal("Pig",
                "A pig is any of the animals in the genus Sus, " +
                    "within the even-toed ungulate family Suidae." +
                    " Pigs include the domestic pig and its ancestor," +
                    " the common Eurasian wild boar, along with other species." +
                    " Related creatures outside the genus include the peccary, " +
                    "the babirusa, and the warthog. "
            ,R.drawable.pig))


        listOfAnimals.add(Animal("Platypus",
                "The platypus, sometimes referred to as the duck-billed platypus," +
                    " is a semiaquatic egg-laying mammal endemic to eastern Australia," +
                    " including Tasmania. Together with the four species of echidna, " +
                    "it is one of the five extant species of monotremes, " +
                    "the only mammals that lay eggs instead of giving birth to live young. "
            ,R.drawable.platypus))


        listOfAnimals.add(Animal("Porcupine",
                "Porcupines are rodents with a coat of sharp spines, or quills," +
                    " that protect against predators. " +
                    "The term covers two families of animals, " +
                    "the Old World porcupines of family Hystricidae, " +
                    "and the New World porcupines of family Erethizontidae. "
            ,R.drawable.porcupine))


        listOfAnimals.add(Animal("Prairie_Dog",
                "Prairie dogs are herbivorous burrowing rodents native " +
                    "to the grasslands of North America. The five species " +
                    "are: black-tailed, white-tailed, Gunnison's, Utah, " +
                    "and Mexican prairie dogs. They are a type of ground squirrel, " +
                    "found in the United States, Canada and Mexico."
            ,R.drawable.prairie_dog))


        listOfAnimals.add(Animal("Pug",
                "The pug is a breed of dog with physically distinctive features of a wrinkly, " +
                    "short-muzzled face, and curled tail. The breed has a fine, glossy " +
                    "coat that comes in a variety of colours, most often fawn or black, " +
                    "and a compact square body with well-developed muscles."
            ,R.drawable.pug))


        listOfAnimals.add(Animal("Rabbit",
                "Rabbits are small mammals in the family Leporidae of the order Lagomorpha. " +
                    "Oryctolagus cuniculus includes the European rabbit species and its descendants," +
                    " the world's 305 breeds of domestic rabbit. " +
                    "Sylvilagus includes 13 wild rabbit species, among them the 7 types of cottontail."
            ,R.drawable.rabbit))


        listOfAnimals.add(Animal("Raccoon",
                "The raccoon, sometimes spelled racoon, also known as the common raccoon," +
                    " North American raccoon, northern raccoon, or coon, " +
                    "is a medium-sized mammal native to North America. " +
                    "The raccoon is the largest of the procyonid family, " +
                    "having a body length of 40 to 70 cm and a body weight of 5 to 26 kg."
            ,R.drawable.raccoon))


        listOfAnimals.add(Animal("Reindeer",
                "The reindeer, also known as the caribou in North America, " +
                    "is a species of deer with circumpolar distribution, " +
                    "native to Arctic, sub-Arctic, tundra, boreal, and mountainous" +
                    " regions of northern Europe, Siberia, and North America. " +
                    "This includes both sedentary and migratory populations."
            ,R.drawable.reindeer))


        listOfAnimals.add(Animal("Rhinoceros",
                "A rhinoceros, commonly abbreviated to rhino, " +
                    "is one of any five extant species of odd-toed " +
                    "ungulates in the family Rhinocerotidae, as well as " +
                    "any of the numerous extinct species. Two of the extant " +
                    "species are native to Africa and three to Southern Asia."
            ,R.drawable.rhinoceros))


        listOfAnimals.add(Animal("Serval",
                "The serval is a wild cat native to Africa. " +
                    "It is rare in North Africa and the Sahel, " +
                    "but widespread in sub-Saharan countries except rainforest regions." +
                    " On the IUCN Red List it is listed as Least Concern. "
            ,R.drawable.serval))


        listOfAnimals.add(Animal("Sheep",
                "Domestic sheep are quadrupedal, ruminant mammals typically kept as livestock." +
                    " Like most ruminants, sheep are members of the order Artiodactyla," +
                    " the even-toed ungulates. Although the name sheep applies " +
                    "to many species in the genus Ovis, in everyday usage it almost always refers to Ovis aries."
            ,R.drawable.sheep))


        listOfAnimals.add(Animal("Skunk",
                "Skunks are North and South American mammals in the family Mephitidae." +
                    " Not related to polecats which are in the weasel family, " +
                    "the closest Old World relative to the skunk is the stink badger. " +
                    "The animals are known for their ability to spray a liquid with a strong, unpleasant smell."
            ,R.drawable.skunk))


        listOfAnimals.add(Animal("Squirrel",
                "Squirrels are members of the family Sciuridae, " +
                    "a family that includes small or medium-size rodents. " +
                    "The squirrel family includes tree squirrels, ground squirrels," +
                    " chipmunks, marmots, flying squirrels, and prairie dogs amongst other rodents."
            ,R.drawable.squirrel))


        listOfAnimals.add(Animal("Termite",
                "Termites are eusocial insects that are classified at the taxonomic " +
                    "rank of infraorder Isoptera, or as epifamily Termitoidae within the " +
                    "cockroach order Blattodea."
            ,R.drawable.termite))


        listOfAnimals.add(Animal("Tiger",
                "The tiger is the largest species among the Felidae and " +
                    "classified in the genus Panthera. It is most recognizable" +
                    " for its dark vertical stripes on reddish-orange fur " +
                    "with a lighter underside. It is an apex predator," +
                    " primarily preying on ungulates such as deer and bovids."
            ,R.drawable.tiger))


        listOfAnimals.add(Animal("Walrus",
                "The walrus is a large flippered marine mammal with a " +
                    "discontinuous distribution about the North Pole " +
                    "in the Arctic Ocean and subarctic seas of the Northern Hemisphere." +
                    " The walrus is the only living species in the family Odobenidae and genus Odobenus."
            ,R.drawable.walrus))


        listOfAnimals.add(Animal("Wasp",
                "A wasp is any insect of the order Hymenoptera and suborder" +
                    " Apocrita that is neither a bee nor an ant. The Apocrita have " +
                    "a common evolutionary ancestor and form a clade; wasps as " +
                    "a group do not form a clade, but are paraphyletic with " +
                    "respect to bees and ants."
            ,R.drawable.wasp))


        listOfAnimals.add(Animal("Water_Buffalo",
                "The water buffalo or domestic water buffalo is a large bovid " +
                    "originating in South Asia, Southeast Asia, and China. " +
                    "Today, it is also found in Europe, Australia, North America, " +
                    "South America and some African countries."
            ,R.drawable.water_buffalo))


        listOfAnimals.add(Animal("Weasel",
                "A weasel is a mammal of the genus Mustela of the family Mustelidae. " +
                    "The genus Mustela includes the least weasels, polecats, stoats, " +
                    "ferrets and minks. Members of this genus are small, active predators," +
                    " with long and slender bodies and short legs. " +
                    "The family Mustelidae is often referred to as the weasel family. "
            ,R.drawable.weasel))


        listOfAnimals.add(Animal("Wildebeest",
                "Wildebeests, also called gnus, are antelopes in the genus Connochaetes. " +
                    "They belong to the family Bovidae, which includes antelopes, cattle, " +
                    "goats, sheep, and other even-toed horned ungulates."
            ,R.drawable.wildebeest))


        listOfAnimals.add(Animal("Wolf",
                "The wolf, also known as the grey/gray wolf or timber wolf, " +
                    "is a canine native to the wilderness and remote areas of " +
                    "Eurasia and North America. It is the largest extant member" +
                    " of its family, with males averaging 43–45 kg and females 36–38.5 kg. "
            ,R.drawable.wolf))


        listOfAnimals.add(Animal("Wombat",
                "Wombats are short-legged, muscular quadrupedal marsupials " +
                    "that are native to Australia. They are about 1 m in length with small," +
                    " stubby tails. There are three extant species and they are all " +
                    "members of the family Vombatidae."
            ,R.drawable.wombat))


        listOfAnimals.add(Animal("Woodchuck",
                "The groundhog, also known as a woodchuck, " +
                    "is a rodent of the family Sciuridae, " +
                    "belonging to the group of large ground " +
                    "squirrels known as marmots. It was first " +
                    "scientifically described by Carl Linnaeus in 1758."
            ,R.drawable.woodchuck))


        listOfAnimals.add(Animal("Yak",
                "The domestic yak is a long-haired domesticated bovid " +
                    "found throughout the Himalayan region of the Indian " +
                    "subcontinent, the Tibetan Plateau and as far north as Mongolia and Russia. " +
                    "It is descended from the wild yak."
            ,R.drawable.yak))


        listOfAnimals.add(Animal("Yellowjacket",
                "Vespula is a small genus of social wasps, widely distributed" +
                    " in the Northern Hemisphere. Along with members of " +
                    "their sister genus Dolichovespula, they are collectively " +
                    "known by the common name yellowjackets in North America."
            ,R.drawable.yellowjacket))


        listOfAnimals.add(Animal("Zebra",
                "Zebras are several species of African equids united by " +
                    "their distinctive black-and-white striped coats. " +
                    "Their stripes come in different patterns, unique to each individual." +
                    " They are generally social animals that live in small harems to large herds. "
            ,R.drawable.zebra))




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
