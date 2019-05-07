package com.example.LearnABirdServer.service.impl;

import com.example.LearnABirdServer.model.Bird;
import com.example.LearnABirdServer.service.DataService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataServiceImpl implements DataService {
    @Override
    public Bird addBird(Bird bird) {
        return null;
    }

    @Override
    public List<Bird> getBirds() {
        Bird bird1 = new Bird();
        Bird bird2 = new Bird();
        Bird bird3 = new Bird();
        Bird bird4 = new Bird();
        Bird bird5 = new Bird();

        bird1.setId(1);
        bird2.setId(2);
        bird3.setId(3);
        bird4.setId(4);
        bird5.setId(5);

        bird1.setName("Parrot");
        bird2.setName("Crow");
        bird3.setName("Pigeon");
        bird4.setName("Eagle");
        bird5.setName("Crane");

        bird1.setInfo("Parrots are members of the order Psittaciformes, which includes more than 350 bird species, including parakeets, macaws, cockatiels and cockatoos, according to the Integrated Taxonomic Information System (ITIS). Though there are many types of parrots, all parrot species have a few traits in common. For example, to be classified as a parrot, the bird must have a curved beak, and its feet must be zygodactyl, which means there are four toes on each foot with two toes that point forward and two that point backward.");
        bird2.setInfo("Crows are black birds known for their intelligence and adaptability, and for their loud, harsh \"caw.\" They also have a reputation for damaging crops; however, their impact may be less than previously thought. \n" +
                "\n" +
                "The genus Corvus comprises crows, ravens and rooks. These birds are all part of the Corvidae family, which includes jays, magpies and nutcrackers.");
        bird3.setInfo("Pigeon, any of several hundred species of birds constituting the family Columbidae (order Columbiformes). Smaller forms are usually called doves, larger forms pigeons. An exception is the white domestic pigeon, the symbol known as the “dove of peace.” \n"+
                "Pigeons occur worldwide except in the coldest regions and the most remote islands. About 250 species are known; two-thirds of them occur in tropical Southeast Asia, Australia, and the islands of the western Pacific, but the family also has many members in Africa and South America and a few in temperate Eurasia and North America. All members of the family suck liquids, rather than sip and swallow as do other birds, and all pigeon parents feed their young “pigeon’s milk,” the sloughed-off lining of the crop, the production of which is stimulated by the hormone prolactin. The nestling obtains this “milk” by poking its bill down the parent’s throat.");
        bird4.setInfo("Eagle, any of many large, heavy-beaked, big-footed birds of prey belonging to the family Accipitridae (order Falconiformes). In general, an eagle is any bird of prey more powerful than a buteo. An eagle may resemble a vulture in build and flight characteristics but has a fully feathered (often crested) head and strong feet equipped with great curved talons. A further difference is in foraging habits: eagles subsist mainly on live prey. They are too ponderous for effective aerial pursuit but try to surprise and overwhelm their prey on the ground. Like owls, many decapitate their kills. Because of their strength, eagles have been a symbol of war and imperial power since Babylonian times. Their likeness is found on Greek and Roman ruins, coins, and medals.");
        bird5.setInfo("Crane, any of 15 species of tall wading birds of the family Gruidae (order Gruiformes). Superficially, cranes resemble herons but usually are larger and have a partly naked head, a heavier bill, more compact plumage, and an elevated hind toe. In flight the long neck is stretched out in front, the stiltlike legs trailing out behind. \n"+
                "Cranes form an ancient group, the earliest fossils having been recovered from Eocene deposits in North America. Living forms are found worldwide except in South America, but populations of many are endangered by hunting and habitat destruction.\n" +
                "\n" +
                "These graceful terrestrial birds stalk about in marshes and on plains, eating small animals of all sorts as well as grain and grass shoots. Two olive-gray eggs spotted with brown are laid in a nest of grasses and weed stalks on drier ground in marsh or field. The same nest may be used year after year. The brownish, downy young can run about shortly after hatching. The trachea (windpipe) is simple in the chick but lengthens with age, coiling upon itself like a French horn. It lies buried in the hollow keel of the breastbone and reaches a length of 1.5 metres (5 feet) in the adult whooping crane (Grus americana).............................................................");

        bird1.setPhoto("parrot.jpg");
        bird2.setPhoto("crow.jpg");
        bird3.setPhoto("pigeon.jpg");
        bird4.setPhoto("eagle.jpg");
        bird5.setPhoto("crane.jpg");

        bird1.setSound("parrot.mp3");
        bird2.setSound("crow.wav");
        bird3.setSound("pigeon.wav");
        bird4.setSound("eagle.wav");
        bird5.setSound("crane.wav");

        List<Bird> birdList = new ArrayList<>();
        birdList.add(bird1);
        birdList.add(bird2);
        birdList.add(bird3);
        birdList.add(bird4);
        birdList.add(bird5);
        return birdList;
    }
}
