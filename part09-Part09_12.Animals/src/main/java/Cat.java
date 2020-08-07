/*
 * Copyright (C) 2020 Dantes
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
/**
 *
 * @author Dantes
 */
public class Cat extends Animal implements NoiseCapable {

    private String name;

    public Cat(String name) {
        super(name);
    }

    public Cat() {

        super("Cat");

        // i used this.name fist for a long time
    }

    public void purr() {

        System.out.println(super.getName() + " purrs");
    }

    @Override
    public void makeNoise() {
        purr();

    }

//    @Override
//    public void sleep() {
//        super.sleep(); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void eat() {
//        super.eat(); //To change body of generated methods, choose Tools | Templates.
//    }

}
