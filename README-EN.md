# TIRA-2021

This repository contains the exercises and course projects of the Data Structures and Algorithms (TIRA, Tietorakenteet ja algoritmit in Finnish) course.

You as a student should fork and clone this repository. You will then work on that forked private repository and use it do deliver your course work to the course teachers. How to start with all this is explained in this readme, and also in the exercise `00-init` readme.

All course work is individual work, so no groups of any size but one.

**IMPORTANT note**: in the exercises and course projects, you are **not allowed** to use Java Collection classes nor algorithms (classes like `Collections`, `Arrays`, `ArrayList`, `LinkedList`, `Stack`, `Vector`, `Queue`, `Set`, any implementation of `Map`, `Arrays.sort`, `Collections.sort`, etc.) unless *explicitly* mentioned in a specific exercise/course project. Using `String` class as well as basic data types int, long, short, double, float, char, and plain arrays (e.g. String [] arrayOfStrings) and the "class" version of these (like `Integer`) is allowed. When you are required to implement a hash function, you must **not** use ready made hash functions, e.g. `String.hashCode` but you must implement hash functions yourself using the basic data types and loops.

## Tools

The tools that are used in this course and you need to install, are listed in [TOOLS-EN.md](TOOLS-EN.md). 

**Install the tools first** and then continue reading forward.

## How to set up your workspace

The instructions in [SETUP-EN.md](SETUP-EN.md) instruct you how to get the course repository forked and cloned to your own PC. You will then do the exercises and course projects on your own PC. When you get things done, you will use git to

1. add changes and new code to your PC's local git repository,
1. push the code to your private git repository in GitLab,
1. from where the teachers can see your progress, help you out with problems, and finally clone your project to grade your work in the course. 

So follow the instructions in  [SETUP-EN.md](SETUP-EN.md) -- you need to do the setup only *once* in the beginning of the course.

**IMPORTANT note**: in the exercises and course projects, you are **not allowed** to use Java Collection classes nor algorithms (classes like Collections, Arrays, ArrayList, LinkedList, Stack, Vector, Queue, Arrays.sort, Collections.sort, etc.) unless *explicitly* mentioned in a specific exercise/course project. Using String class as well as basic data types int, long, short, double, float, char, and plain arrays (e.g. String [] arrayOfStrings) is allowed.

## Timing and deadlines

The table below describes the timing of the course in Fall 2021. 

> Note that if you want and are able to, **you may proceed faster** than the schedule indicates. It is also a good idea to start looking at the **course projects early**. For example, the BooksAndWords project requires you to implement reading text files. You should already know how this is done, based on what you have learned in previous courses. So you can start implementing that early, and later focus on choosing a suitable data structure and algorithms for your implementation, when you have learned more on this course.

Each subdirectory contains detailed instructions in `README.md` files for that specific exercise or course project. As you go along to those exercises, view the readme files in each subdirectory for exercise / course project specific instructions.

When the course deadline comes, teachers will use automatic scripts that will clone all student repositories for evaluation and grading. The version on that date & time will be evaluated.  Late deliveries are *not* taken into account.

> Note that those who apply for the IPS study program **Candidate Project** course starting in January 2022 will have an **earlier deadline in Jan 4th**.

**Lectures** marked with + are short, online **live Q&A and demonstration sessions**, not actual lectures.

The actual lectures are **recordings** viewable at suitable times considering your own schedules. Note that you must watch the corresponding lecture videos and view relevant demonstrations *before* the exercises. So reserve enought time to view the lectures each week before the exercise. Lecture topics and exercise numbers match so you can use these to make sure you view lectures on time.

Note that if you decide to do the **Mazes course project** and not the BooksAndWords, you may want to start watching the Graph lectures earlier to get a good start to your course project. This way you have more time to focus on the Maze project than watching the lectures following the default time table.

**Exercises** are scheduled so that you *start* working on them the week indicated. You may work on the exercise later; no other deadline for exercises than the course deadline at the end. But do not push the work too far ahead, then you have many unfinished exercises to work with, overloading you. It is a good idea to start working on the exercises *before* the actual exercise sessions. Otherwise, in the session you do not have anything (questions, problems) teachers can help you with. Using the exercise sessions to read instructions is not productive use of time.

> Hint: You can keep track of your work by removing each `TODO` comment in the code for each exercise and project. When you cannot find any `TODO` items using the IDE search tool, and tests pass, you should be done. Note though that even though tests pass, your code may not be perfect or even acceptable if your implementation has faults not exposed by the tests.


| Week |  Topic               | Exercise                            | Lecture Demo             |
|------|----------------------|-------------------------------------|--------------------------|
|  44  | 00 Course intro      | [00-init](00-init)                  | Non-graded task          |
|      | 01 Topic intro       | [01-arrays](01-arrays)              | Until DL 1               |
|      | 02 Time complexity   | [02-mode](02-mode)                  | Until DL 1               |
|  45  | 03 Analysis          | [03-draw](03-draw)                  | Until DL 1               |
|      | 03 Analysis          | [04-1-stack](04-1-stack)            | Until DL 1               |
|      | 04-1 Stack           |                                     |                          |
|      | 04-2/3 Queue + list  |                                     |                          |
|  46  | 05 Sorting algorithms| [04-2-queue](04-2-queue)            | Until DL 2               |
|      | 05 Sorting algorithms| [04-3-linkedlist](04-3-linkedlist)  | Until DL 2               |
|      | 06 Hash tables       |                                     |                          |
|      | 06 Hash tables       |                                     |                          |
|  47  | 07 Binary search tree| [05-binsearch](05-binsearch)        | Until DL 2               |
|      | 07 Binary search tree| [05-invoices](05-invoices)          | Until DL 3               |
|      | 08 Graphs part 1     |                                     |                          |
|      | 08 Graphs part 1     |                                     | DL 1: Nov 27, 23.59      |
|  48  | 08 Graphs part 2     | [67-phonebook](67-phonebook)        | Until DL 3               |
|      | 08 Graphs part 2     | Optional [xx-braille] task          |                          |
|      | 09 Design & Dynamic  |                                     |                          |
|      | 09 Design & Dynamic  |                                     |                          |
|  49  | Q&A                  |                                     | DL 2: Dec 11, 23.59      |
|  50  | Exam                 |                                     |                          |
|1/2023|                      |                                     |                          |
|2/2023|                      |                                     | DL 3: Jan 15, 23.59      |

## Grading

The course is graded with the following rules:

1. All exercises must be acceptable (1 points), 5 pts is awarded from a good result.
1. Exam must be passed with minimum of 10 points from the total of 20 pts.

Remember that functionally correct course project *is not enough*. The course projects must be implemented with *time complexity* in mind. If your project is not *fast* enough with *large* data sets, it may be graded failed even though it may be functionally correct, i.e. produces the correct result. This is explained in detail in the course introductory lectures.

Also note that here you will learn how to implement data structures and algorithms to be used in other contexts and by other developers. The code must not therefore do anything else than what is is supposed to do. Examples of what the code should *not include or do* are:

* A data structure contains a `main()` method.
* Code compiles with warnings.
* Code includes code commented out, left there for some reason.
* Code includes expermental, "trying this stuff out" kind of code, not part of the actual data structure or algorithm implementation.
* Code prints out something to the console (System.out.println or such).
* The data structure or algoritm uses more than necessary amounts of memory, than what is necessary to implement it.

Note that in the table below, in the *Min points* column it is assumed that the course project has no weaknesses. If the project *does* have weaknesses, then you must get better points from exercises and/or the exam to pass the course.

| Course task   | Min points      | Max Points      |
|---------------|-----------------|-----------------|
| Exercises     | 10 * 1 == 10pts | 10 * 5 == 50pts |
| Course project| 30 pts          | 30pts +bonuses  |
| Exam          | 10 pts          | 20 pts          |
| **TOTAL**     | **50 pts**      | **100 pts**     |

Grade is determined from the points following the table below:

| Points | < 50  | 50-59 | 60-69 | 70-79 | 80-89 | >= 90  |
|--------|-------|-------|-------|-------|-------|--------|
| Grade  | Fail  |   1   |   2   |   3   |   4   |   5    |

## Copying and plagiarizing

All code delivered as course work must be written by the student him/herself taking part in the course. Copying code from others and from the internet in this course is **forbidden**. You may work together with a student friend or small group, but each of you must write **each and every line** of code to your project by yourself. You may do pair programming, for example, so that you work together on the problem to solve and *both of you* write your *own* code in your *own* repository to solve the tasks. *You yourself alone* are responsible for your code and receive the course grade from work done with your project.

You may use the course demonstrations and other course material for inspiration for your implementations in the exercises and course projects. You may -- and it is also recommended -- also search the internet for help. This is actually an important developer skill to have. But again, **each and every line of code** must be written by yourself, not copy-pasted.

If you use any code from others as inspiration, you **must** acknowledge that in your code in the comments. Add the source of the inspiration in the comments and provide the URL to the inspiration.

If copying or plagiarizing is suspected, teachers will follow the [University of Oulu procedures (pdf)](https://www.oulu.fi/external/Ohje-vilppitapausten-ehkaisemiseen-ja-kasittelemiseen-Oulun-yliopistossa-2018.pdf) in handling these cases. An interview with the student is arranged with course teachers. After hearing the student, teachers will decide if the issue should be taken forward. The minimum consequence is the immediate termination of the course for the student with a failed grade. If the case is serious, the matter will also be handed over to the Dean of the Faculty of Information Technology and Electrical Engineering.

## About

* Course material for Tietorakenteet ja algoritmit | Data structures and algorithms 2021.
* Study Program for Information Processing Science, University of Oulu.
* Antti Juustila, INTERACT Research Group.
