class DuplicateCheckTest{

private DuplicateCheck duplicateCheck;

    @Before 
    public void init() {
           duplicateCheck = new DuplicateCheck();
    }

@Test
public void whenDuplicateIsPresentOnlyOnce(){
int[] arr = new int[]{1,2,3,3}; 
Assert.assertEquals(3, duplicateCheck.duplicate());
}

@Test
public void whenDuplicateIsPresentOnlyMoreThanOnce()
int[] arr = new int[]{1,3,3,3}; 
Assert.assertEquals(3, duplicateCheck.duplicate());
}

@Test
public void whenDuplicateIsPresentInTheStart()
int[] arr = new int[]{4,4,3,1,2}; 
Assert.assertEquals(4, duplicateCheck.duplicate());
}

@Test
public void whenMoreThanTwoTypeOfDuplicateArePresent()
{
int[] arr = new int[]{5,6,4,5,4,2,1}; 
Assert.assertEquals(5, duplicateCheck.duplicate());
}
