package com.codeclan.filesandfolders;

import com.codeclan.filesandfolders.models.File;
import com.codeclan.filesandfolders.models.Folder;
import com.codeclan.filesandfolders.models.Person;
import com.codeclan.filesandfolders.repositories.FileRepository;
import com.codeclan.filesandfolders.repositories.FolderRepository;
import com.codeclan.filesandfolders.repositories.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FilesandfoldersApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	PersonRepository personRepository;

	@Test
	void contextLoads() {
	}

//	@Test
//	void canAddFile() {
//		File file = new File("Final", "Word", 3, folder);
//		fileRepository.save(file);
//	}

	@Test
	void canAddFolderAndPersonAndFile() {
		Person person = new Person("DaveyBoy");
		personRepository.save(person);
		Folder folder1 = new Folder("PDA", person);
		folderRepository.save(folder1);
		File file1 = new File("FinalFinal", "Word", 32, folder1);
		fileRepository.save(file1);

	}

//	@Test
//	void canAddPerson() {
//		Person person = new Person("Davey Boy");
//		personRepository.save(person);
//	}

}
