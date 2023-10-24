fun engineStatus(engineNumber: Int): String {
    try  {
        return rawEngineStatus(engineNumber);
    } catch (e: EngineNotFoundException) {
        return "engine $engineNumber not found"
    } catch (e: SensorsMeltException) {
        return "engine $engineNumber offline"
    }

}

fun rawEngineStatus(engineNumber: Int): String {
    return "asdf"
}