package com.ob1ju4n.controller;

import com.ob1ju4n.domain.Item;
import com.ob1ju4n.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Juan on 26/09/2016.
 */
@RestController
@RequestMapping("api/croma-store")
public class StoreController {

    private ItemService itemService;

    @Autowired
    public StoreController(ItemService itemService) {
        this.itemService = itemService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<Item>> list(){
        return new ResponseEntity<List<Item>>(itemService.list(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Item> read(@PathVariable(value = "id") long id){
        return new ResponseEntity<Item>(itemService.read(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<Item> create(@RequestBody Item item){
        return new ResponseEntity<Item>(itemService.create(item), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Item> update(@PathVariable(value = "id") long id, @RequestBody Item item){
        return new ResponseEntity<Item>(itemService.update(id, item), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") long id){
        itemService.delete(id);
        if(itemService.exists(id)){
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }else {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
    }
}
