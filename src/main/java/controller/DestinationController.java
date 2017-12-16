package controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.service.Service;
import model.service.DestinationService;

@RestController
public class DestinationController {
	private Service service;

	public DestinationController() {
		service = new DestinationService();
		this.vulDataBank();
	}
	private void vulDataBank(){
		service.addDataToDataBase("Leuven", "Leuven: Leuven (Frans: Louvain; Duits: Löwen) is een stad en gemeente in de Belgische provincie Vlaams-Brabant. Het is de hoofdstad van deze provincie en tevens de hoofdplaats van het bestuurlijke en gerechtelijke arrondissement Leuven. Leuven heeft een oppervlakte van 5.663 ha en rondde in de loop van 2016 voor het eerst de kaap van 100.000 inwoners.");
		service.addDataToDataBase("Gent", "Gent: Gent (Frans: Gand) is de hoofdstad van de Belgische provincie Oost-Vlaanderen en van het arrondissement Gent. Gent heeft een oppervlakte van 156,18 km² en telt circa 259.000 inwoners (2017), waarmee het naar inwonertal de op één na grootste gemeente van België is, na Antwerpen. De stad is tevens de hoofdplaats van het kieskanton Gent en telt vijf gerechtelijke kantons.");
		service.addDataToDataBase("Antwerpen", "Antwerpen: Antwerpen (Frans: Anvers) is de hoofdstad van de provincie Antwerpen en van het gelijknamige arrondissement, in België. Antwerpen telt circa 521.815 inwoners (2017) en is daarmee qua inwonertal de grootste gemeente van België. Naar oppervlakte is het de op twee na grootste gemeente, na Doornik en Couvin.");
		service.addDataToDataBase("Kortrijk", "Kortrijk (Frans: Courtrai) is een centrumstad in het zuiden van de Belgische provincie West-Vlaanderen en is de hoofdplaats van het gelijknamige bestuurlijke en gerechtelijke arrondissement. De stad ligt aan de rivier de Leie en telt ruim 75.000 inwoners. Kortrijk ligt 25 km ten noordoosten van de Franse stad Rijsel, waarmee het een transnationaal Eurodistrict vormt: de Franse-Belgische Eurometropool Rijsel-Kortrijk-Doornik met ongeveer 2.100.000 inwoners. Een inwoner van Kortrijk wordt een Kortrijkzaan/Kortrijkzane of soms ook Kortrijkenaar genoemd.");
		service.addDataToDataBase("Hasselt", "Hasselt is de hoofdstad van de Belgische provincie Limburg en telt ongeveer 77.000 inwoners, die Hasselaars[1] worden genoemd. De stad is tevens de hoofdplaats van het kieskanton en de twee gerechtelijk kantons Hasselt. Hasselt is gelegen aan het Albertkanaal en de Demer, aan de rand van de Kempen, midden in de Grensregio Vlaanderen-Nederland.");
	}
	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET)
	public String getInfo() {
		return service.getAllDataAsJSON();
	}
	@CrossOrigin
	@RequestMapping(value = "/destination/steden", method = RequestMethod.GET)
	public List<String> getSteden() {
		return service.getAllSteden();
	}
	@CrossOrigin
	@RequestMapping(value = "/destination/{stad}", method = RequestMethod.GET)
	public String getInfoVoorStad(@PathVariable String stad) {
		return service.getInfoForStadAsJson(stad);
	}

	/*@CrossOrigin
	@RequestMapping(value = "/destination/post", method = RequestMethod.GET)
	public List<String> getpostcodes() {
		return service.getAllPostcodes();
	}*/

}
