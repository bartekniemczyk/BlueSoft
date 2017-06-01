package com.niemczyk.controller;

import com.niemczyk.dao.Deals;
import com.niemczyk.service.DealService;
import com.niemczyk.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by Bartek on 25.05.2017.
 */
@Controller
@RequestMapping(value = "/deals")
public class DealController {
    @Autowired
    DealService dealService;
    @Autowired
    SystemService systemService;

    @RequestMapping(value = "/systems", method = RequestMethod.GET)
    public String getSystems(Model model) {

        model.addAttribute("system", this.systemService.getAllSystems());

        return "systems";
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String getDeals(Model model) {

        model.addAttribute("deals", this.dealService.getAllDeals());

        return "allDeals";
    }

    @RequestMapping(value = "/active", method = RequestMethod.GET)
    public String getActiveDeals(Model model) {

        model.addAttribute("activeDeals", this.dealService.getAllDeals()
                .stream()
                .filter(deal -> Objects.equals(deal.getActiv(), "TAK"))
                .collect(Collectors.toList()));
        return "activDeals";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addNewProductForm(Model model) {
        Deals newDeal = new Deals();
        model.addAttribute("newDeal", newDeal);
        return "addDeal";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String processAddNewProductForm(@ModelAttribute("newDeal") Deals dealToBeAdded) {

        dealService.addDeal(dealToBeAdded);

        return "redirect:/deals/all";
    }

    @RequestMapping(value = "/update/{dealId}", method = RequestMethod.GET)
    public String updateProductForm(@PathVariable(value = "dealId") String dealId, Model model) {
        Deals updateDeal = new Deals();
        model.addAttribute("updateDeal", updateDeal);
        model.addAttribute("dealId", dealId);
        return "updateDeal";
    }

    @RequestMapping(value = "/update/{dealId}", method = RequestMethod.POST)
    public String processUpdateProductForm(@PathVariable(value = "dealId") String dealId,
                                           @ModelAttribute("updateDeal") Deals dealToBeUpdate) {
        dealService.updateDeal(dealId, dealToBeUpdate);

        return "redirect:/deals/all";
    }

    @RequestMapping(value = "/author", method = RequestMethod.GET)
    public String getAuthor() {
        return "developer";
    }
}
