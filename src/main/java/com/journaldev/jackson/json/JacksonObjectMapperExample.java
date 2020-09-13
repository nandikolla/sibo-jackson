package com.journaldev.jackson.json;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.journaldev.jackson.model.ImageFile;
import com.journaldev.jackson.model.Images;


public class JacksonObjectMapperExample {

	public static void main(String[] args) throws IOException {
		
		//read json file data to String

		//create ObjectMapper instance
		ObjectMapper objectMapper = new ObjectMapper();

		//File yourFile = new File("wix_images_WomenSuites.csv");
		File yourFile = new File("wix_images_final_09-12-2020.csv");
		yourFile.createNewFile(); // if file already exists will do nothing
		BufferedWriter writer = new BufferedWriter(new FileWriter(yourFile,false));

		//convert json string to object
		//https://files.wix.com/go/site/media/files/list?site_token=JWS.eyJraWQiOiJuRVF5Y0M5TiIsImFsZyI6IkhTMjU2In0.eyJkYXRhIjoie1widXNlcklkXCI6XCI1OWE3YjljNi1jZDM5LTRlNTEtYTAzNC02YjMxOTgyYmQ0YTRcIixcIm1ldGFzaXRlSWRcIjpcIjFhOWE4MjM0LWFiNzItNDUzMi1hNTM3LTY5MmJmYTcyYTQ5MFwifSIsImlhdCI6MTU5OTg0NDY5MiwiZXhwIjoxNjAxMDU0MjkyfQ._csvlAhWgwuhhCYRZAl6NObCbBcHNGwrqmhcfcDRtWg&page_size=900&parent_folder_id=9bb5c40787794f7a9553413835de05d2&media_type=picture,video,music,document,shape,site_icon,archive,swf&order=-date
		byte[] styleJsonData = Files.readAllBytes(Paths.get("StyleAdvice.json"));
		Images emp = objectMapper.readValue(styleJsonData, Images.class);
		for (ImageFile img : emp.getFiles()) {
			writer.write("Style Advice/" +img.getOriginal_file_name() + "," + img.getFile_url() );
			writer.newLine();
			System.out.println("Image Name " + img.getOriginal_file_name() + " "  + " Wix ID" + img.getFile_url());
		}

		//https://files.wix.com/go/site/media/files/list?site_token=JWS.eyJraWQiOiJuRVF5Y0M5TiIsImFsZyI6IkhTMjU2In0.eyJkYXRhIjoie1widXNlcklkXCI6XCI1OWE3YjljNi1jZDM5LTRlNTEtYTAzNC02YjMxOTgyYmQ0YTRcIixcIm1ldGFzaXRlSWRcIjpcIjFhOWE4MjM0LWFiNzItNDUzMi1hNTM3LTY5MmJmYTcyYTQ5MFwifSIsImlhdCI6MTU5OTg0NDY5MiwiZXhwIjoxNjAxMDU0MjkyfQ._csvlAhWgwuhhCYRZAl6NObCbBcHNGwrqmhcfcDRtWg&page_size=200&parent_folder_id=6ea36dd5d1e443e19bbcff160dc617c6&media_type=picture,video,music,document,shape,site_icon,archive,swf&order=-date
		byte[] womenSuitesJsonData = Files.readAllBytes(Paths.get("WomenSuites.json"));
		emp = objectMapper.readValue(womenSuitesJsonData, Images.class);
		for (ImageFile img : emp.getFiles()) {
			writer.write("women suits formal/" + img.getOriginal_file_name() + "," + img.getFile_url() );
			writer.newLine();
			System.out.println("Image Name " + img.getOriginal_file_name() + " "  + " Wix ID" + img.getFile_url());
		}

		//https://files.wix.com/go/site/media/files/list?site_token=JWS.eyJraWQiOiJuRVF5Y0M5TiIsImFsZyI6IkhTMjU2In0.eyJkYXRhIjoie1widXNlcklkXCI6XCI1OWE3YjljNi1jZDM5LTRlNTEtYTAzNC02YjMxOTgyYmQ0YTRcIixcIm1ldGFzaXRlSWRcIjpcIjFhOWE4MjM0LWFiNzItNDUzMi1hNTM3LTY5MmJmYTcyYTQ5MFwifSIsImlhdCI6MTU5OTg0NDY5MiwiZXhwIjoxNjAxMDU0MjkyfQ._csvlAhWgwuhhCYRZAl6NObCbBcHNGwrqmhcfcDRtWg&page_size=500&parent_folder_id=68e0368d28ac4e26a4b347f14a59cfdc&media_type=picture,video,music,document,shape,site_icon,archive,swf&order=-date
		byte[] JsonData2030 = Files.readAllBytes(Paths.get("20-30-outfit.json"));
		emp = objectMapper.readValue(JsonData2030, Images.class);
		for (ImageFile img : emp.getFiles()) {
			writer.write("20-30 outfits/" +img.getOriginal_file_name() + "," + img.getFile_url() );
			writer.newLine();
			System.out.println("Image Name " + img.getOriginal_file_name() + " "  + " Wix ID" + img.getFile_url());
		}

		//https://files.wix.com/go/site/media/files/list?site_token=JWS.eyJraWQiOiJuRVF5Y0M5TiIsImFsZyI6IkhTMjU2In0.eyJkYXRhIjoie1widXNlcklkXCI6XCI1OWE3YjljNi1jZDM5LTRlNTEtYTAzNC02YjMxOTgyYmQ0YTRcIixcIm1ldGFzaXRlSWRcIjpcIjFhOWE4MjM0LWFiNzItNDUzMi1hNTM3LTY5MmJmYTcyYTQ5MFwifSIsImlhdCI6MTU5OTg0NDY5MiwiZXhwIjoxNjAxMDU0MjkyfQ._csvlAhWgwuhhCYRZAl6NObCbBcHNGwrqmhcfcDRtWg&page_size=50&parent_folder_id=bae567a3cffc48f998021d7e6b1ec5d5&media_type=picture,video,music,document,shape,site_icon,archive,swf&order=-date
		byte[] curveyLadiesJsonData = Files.readAllBytes(Paths.get("CurveyLadies.json"));
		emp = objectMapper.readValue(curveyLadiesJsonData, Images.class);
		for (ImageFile img : emp.getFiles()) {
			writer.write("Curvy ladies/" + img.getOriginal_file_name() + "," + img.getFile_url() );
			writer.newLine();
			System.out.println("Image Name " + img.getOriginal_file_name() + " "  + " Wix ID" + img.getFile_url());
		}


//  https://files.wix.com/go/site/media/files/list?site_token=JWS.eyJraWQiOiJuRVF5Y0M5TiIsImFsZyI6IkhTMjU2In0.eyJkYXRhIjoie1widXNlcklkXCI6XCI1OWE3YjljNi1jZDM5LTRlNTEtYTAzNC02YjMxOTgyYmQ0YTRcIixcIm1ldGFzaXRlSWRcIjpcIjFhOWE4MjM0LWFiNzItNDUzMi1hNTM3LTY5MmJmYTcyYTQ5MFwifSIsImlhdCI6MTU5OTg0NDY5MiwiZXhwIjoxNjAxMDU0MjkyfQ._csvlAhWgwuhhCYRZAl6NObCbBcHNGwrqmhcfcDRtWg&page_size=500&parent_folder_id=15f294ab7e9044b2ba738993d3bc097a&media_type=picture,video,music,document,shape,site_icon,archive,swf&order=-date
		byte[] eveningClassesJsonData = Files.readAllBytes(Paths.get("eveningClasses.json"));
		emp = objectMapper.readValue(eveningClassesJsonData, Images.class);
		for (ImageFile img : emp.getFiles()) {
			writer.write("evening dresses/" + img.getOriginal_file_name() + "," + img.getFile_url() );
			writer.newLine();
			System.out.println("Image Name " + img.getOriginal_file_name() + " "  + " Wix ID" + img.getFile_url());
		}

		// https://files.wix.com/go/site/media/files/list?site_token=JWS.eyJraWQiOiJuRVF5Y0M5TiIsImFsZyI6IkhTMjU2In0.eyJkYXRhIjoie1widXNlcklkXCI6XCI1OWE3YjljNi1jZDM5LTRlNTEtYTAzNC02YjMxOTgyYmQ0YTRcIixcIm1ldGFzaXRlSWRcIjpcIjFhOWE4MjM0LWFiNzItNDUzMi1hNTM3LTY5MmJmYTcyYTQ5MFwifSIsImlhdCI6MTU5OTg0NDY5MiwiZXhwIjoxNjAxMDU0MjkyfQ._csvlAhWgwuhhCYRZAl6NObCbBcHNGwrqmhcfcDRtWg&page_size=50&parent_folder_id=96237030d87f4902a25f89a9da6f16db&media_type=picture,video,music,document,shape,site_icon,archive,swf&order=-date
		byte[] JsonData50 = Files.readAllBytes(Paths.get("50.json"));
		emp = objectMapper.readValue(JsonData50, Images.class);
		for (ImageFile img : emp.getFiles()) {
			writer.write("50+" + img.getOriginal_file_name() + "," + img.getFile_url() );
			writer.newLine();
			System.out.println("Image Name " + img.getOriginal_file_name() + " "  + " Wix ID" + img.getFile_url());
		}


		// https://files.wix.com/go/site/media/files/list?site_token=JWS.eyJraWQiOiJuRVF5Y0M5TiIsImFsZyI6IkhTMjU2In0.eyJkYXRhIjoie1widXNlcklkXCI6XCI1OWE3YjljNi1jZDM5LTRlNTEtYTAzNC02YjMxOTgyYmQ0YTRcIixcIm1ldGFzaXRlSWRcIjpcIjFhOWE4MjM0LWFiNzItNDUzMi1hNTM3LTY5MmJmYTcyYTQ5MFwifSIsImlhdCI6MTU5OTg0NDY5MiwiZXhwIjoxNjAxMDU0MjkyfQ._csvlAhWgwuhhCYRZAl6NObCbBcHNGwrqmhcfcDRtWg&page_size=50&parent_folder_id=96237030d87f4902a25f89a9da6f16db&media_type=picture,video,music,document,shape,site_icon,archive,swf&order=-date
		byte[] JsonData_final_2030 = Files.readAllBytes(Paths.get("final-20-30.json"));
		emp = objectMapper.readValue(JsonData_final_2030, Images.class);
		for (ImageFile img : emp.getFiles()) {
			writer.write("Final 20-30/" + img.getOriginal_file_name() + "," + img.getFile_url() );
			writer.newLine();
			System.out.println("Image Name " + img.getOriginal_file_name() + " "  + " Wix ID" + img.getFile_url());
		}

		writer.close();

		
		//read JSON like DOM Parser
		/*JsonNode rootNode = objectMapper.readTree(womenSuitesJsonData);
		JsonNode phoneNosNode = rootNode.path("files");
		Iterator<JsonNode> elements = phoneNosNode.elements();
		while(elements.hasNext()){
			JsonNode phone = elements.next();
			System.out.println("Phone No = "+phone);
		}*/
		

		

	}
	


}
