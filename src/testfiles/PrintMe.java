// `JorthVM', a Java VM implemented in Forth
// 
// Copyright (C) 2012 Sebastian Rumpl <e0828489@student.tuwien.ac.at>
// Copyright (C) 2012 Josef Eisl <zapster@zapster.cc>
// Copyright (C) 2012 Bernhard Urban <lewurm@gmail.com>
// 
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
// 
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
// 
// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.

public class PrintMe {
	public static native void printHello();

	public static void main(String []args) {
		printHello();
	}
}