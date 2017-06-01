package com.niemczyk.controller;

import com.niemczyk.service.DealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
 * Created by Bartek on 29.05.2017.
 */
@Controller
@RequestMapping(value = "/rest")
public class DealRestController {
    @Autowired
    DealService dealService;
    @RequestMapping(value = "/remove/{dealId}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void removeItem(@PathVariable String dealId) {

    dealService.deleteDeal(dealId);
    }

}
