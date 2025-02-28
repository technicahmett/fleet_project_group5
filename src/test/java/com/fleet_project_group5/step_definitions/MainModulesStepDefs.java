package com.fleet_project_group5.step_definitions;

import com.fleet_project_group5.pages.MainModulesPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class MainModulesStepDefs {


    MainModulesPage mainModulesPage = new MainModulesPage();

    //@Then("the user should see the following modules:")
    //public void the_user_should_see_the_following_modules(io.cucumber.datatable.DataTable dataTable) {

    @Then("the user should see the following modules:")
    public void the_user_should_see_the_following_modules(DataTable dataTable) {
        // Kullanıcının görmesi gereken modülleri feature dosyasından al
        List<String> expectedModules = dataTable.asList();

        // Sayfada gerçekten görünen modülleri al
        List<String> actualModules = mainModulesPage.getModuleNames();

        // Modül isimlerini karşılaştır
        Assert.assertEquals("Modüller beklenenle uyuşmuyor!", expectedModules, actualModules);

        // Ekstra kontrol: Görünen modülleri konsola yazdır (debug amaçlı)
        System.out.println("Expected Modules: " + expectedModules);
        System.out.println("Actual Modules: " + actualModules);
    }
}



