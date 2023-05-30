package com.codeclan.filesandfolders.components;

import com.codeclan.filesandfolders.models.File;
import com.codeclan.filesandfolders.models.Folder;
import com.codeclan.filesandfolders.models.Person;
import com.codeclan.filesandfolders.repositories.FileRepository;
import com.codeclan.filesandfolders.repositories.FolderRepository;
import com.codeclan.filesandfolders.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component // Comment this out if you do not to run the data loader
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    PersonRepository personRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        Person jim = new Person("Jim");
        personRepository.save(jim);

        Person bob = new Person("Bob");
        personRepository.save(bob);

        Folder big_folder = new Folder("Big Folder", jim);
        folderRepository.save(big_folder);

        Folder little_folder = new Folder("Little Folder", bob);
        folderRepository.save(little_folder);

        File big_file = new File("Big File", ".xl", 20, big_folder);
        fileRepository.save(big_file);

        File little_file = new File("Little File", ".txt", 1, little_folder);
        fileRepository.save(little_file);



    }
}
