package com.example.demo;

import com.example.demo.swagger.handler.PetApi;
import com.example.demo.swagger.model.ModelApiResponse;
import com.example.demo.swagger.model.Pet;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@Controller
public class PetApiController implements PetApi {
	@Override
	public ResponseEntity<Void> addPet(@Valid Pet body) {
		return null;
	}

	@Override
	public ResponseEntity<Void> deletePet(Long petId, String apiKey) {
		return null;
	}

	@Override
	public ResponseEntity<List<Pet>> findPetsByStatus(@NotNull @Valid List<String> status) {
		return null;
	}

	@Override
	public ResponseEntity<List<Pet>> findPetsByTags(@NotNull @Valid List<String> tags) {
		return null;
	}

	@Override
	public ResponseEntity<Pet> getPetById(Long petId) {
		return null;
	}

	@Override
	public ResponseEntity<Void> updatePet(@Valid Pet body) {
		return null;
	}

	@Override
	public ResponseEntity<Void> updatePetWithForm(Long petId, String name, String status) {
		return null;
	}

	@Override
	public ResponseEntity<ModelApiResponse> uploadFile(Long petId, String additionalMetadata, @Valid MultipartFile file) {
		return null;
	}
}
