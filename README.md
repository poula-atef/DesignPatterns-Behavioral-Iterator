# ايه هو البرنامج ده؟
- البرنامج ده هو عباره عن مثال لل Iterator Design Pattern باستخدام لغة java
# بنستخدم امتي ال Design Pattern ده؟
- لما يكون عندي tree عايز اعمل traverse فيها من عند اي نقطه و ب اكتر من Iterator بدون اظهار اي معلومه عن اي حاجه في ال tree او عن ال implementation بتاعت ال iterator
# بيتكون من ايه البرنامج ده ؟
- ال package بتاعت ال iterator:
  - ال Iterator Interface و ده فيه ال methods اللي المفروض تبقي في اي Iterator هيتعمل
  - ال DFSIterator و ده بيستخدم طريقة ال Depth First Search و ده بيعمل implementation لل Iterator Interface
  - ال BFSIterator و ده بيستخدم طريقة ال Breadth First Search و ده بيعمل implementation لل Iterator Interface
- ال package بتاعت ال tree:
  - ال Node Iterface و ده فيه ال methods اللي المفروض تبقي في اي Tree هتتعمل
  - ال TreeNode و ده ال tree الاساسيه بتاعتنا و بيعمل implementation لل Node Interface
